import java.util.*;

class Book {
    private String bookId;
    private String title;
    private int totalCopies;
    private int availableCopies;
    private Queue<String> waitlist;
    
    public Book(String bookId, String title, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.waitlist = new LinkedList<>();
    }
    
    public String getBookId() {
        return bookId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getAvailableCopies() {
        return availableCopies;
    }
    
    public void decrementCopies() {
        availableCopies--;
    }
    
    public void incrementCopies() {
        availableCopies++;
    }
    
    public void addToWaitlist(String userId) {
        waitlist.add(userId);
    }
    
    public String removeFromWaitlist(String userId) {
        Queue<String> temp = new LinkedList<>();
        String removed = null;
        while (!waitlist.isEmpty()) {
            String user = waitlist.poll();
            if (user.equals(userId) && removed == null) {
                removed = user;
            } else {
                temp.add(user);
            }
        }
        waitlist = temp;
        return removed;
    }
    
    public Queue<String> getWaitlist() {
        return waitlist;
    }
    
    public boolean hasAvailableCopies() {
        return availableCopies > 0;
    }
}

class User {
    private String userId;
    private List<String> borrowedBooks;
    private static final int MAX_BORROW_LIMIT = 3;
    
    public User(String userId) {
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public String getUserId() {
        return userId;
    }
    
    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    public boolean canBorrow() {
        return borrowedBooks.size() < MAX_BORROW_LIMIT;
    }
    
    public void addBook(String bookId) {
        borrowedBooks.add(bookId);
    }
    
    public void removeBook(String bookId) {
        borrowedBooks.remove(bookId);
    }
    
    public boolean hasBorrowed(String bookId) {
        return borrowedBooks.contains(bookId);
    }
}

class Library {
    private Map<String, Book> books;
    private Map<String, User> users;
    private Queue<String> globalWaitlist;
    
    public Library() {
        books = new LinkedHashMap<>();
        users = new HashMap<>();
        globalWaitlist = new LinkedList<>();
        initializeLibrary();
    }
    
    private void initializeLibrary() {
        books.put("B001", new Book("B001", "1984", 3));
        books.put("B002", new Book("B002", "To Kill a Mockingbird", 4));
        
        users.put("U001", new User("U001"));
        users.put("U002", new User("U002"));
        users.put("U003", new User("U003"));
        users.put("U004", new User("U004"));
        users.put("U005", new User("U005"));
        users.put("U006", new User("U006"));
    }
    
    public void borrow(String userId, String bookId) {
        User user = users.get(userId);
        Book book = books.get(bookId);
        
        if (user == null || book == null) {
            System.out.println("Invalid user or book ID");
            return;
        }
        
        if (!user.canBorrow()) {
            System.out.println("User " + userId + " has reached borrowing limit");
            return;
        }
        
        if (book.hasAvailableCopies()) {
            book.decrementCopies();
            user.addBook(bookId);
            System.out.println("User " + userId + " borrowed book " + bookId);
        } else {
            book.addToWaitlist(userId);
            globalWaitlist.add(userId + ":" + bookId);
            System.out.println("No copies available. User " + userId + " added to waitlist for book " + bookId);
        }
    }
    
    public void returnBook(String userId, String bookId) {
        User user = users.get(userId);
        Book book = books.get(bookId);
        
        if (user == null || book == null) {
            System.out.println("Invalid user or book ID");
            return;
        }
        
        if (!user.hasBorrowed(bookId)) {
            System.out.println("User " + userId + " has not borrowed book " + bookId);
            return;
        }
        
        user.removeBook(bookId);
        System.out.println("User " + userId + " returned book " + bookId);
        
        boolean assigned = false;
        Queue<String> tempQueue = new LinkedList<>();
        
        while (!globalWaitlist.isEmpty() && !assigned) {
            String entry = globalWaitlist.poll();
            String[] parts = entry.split(":");
            String waitingUserId = parts[0];
            String requestedBookId = parts[1];
            
            User waitingUser = users.get(waitingUserId);
            
            if (waitingUser.canBorrow()) {
                waitingUser.addBook(bookId);
                System.out.println("User " + waitingUserId + " assigned book " + bookId + " from waitlist");
                assigned = true;
                
                if (requestedBookId.equals(bookId)) {
                    Book requestedBook = books.get(requestedBookId);
                    requestedBook.removeFromWaitlist(waitingUserId);
                }
            } else {
                tempQueue.add(entry);
            }
        }
        
        while (!tempQueue.isEmpty()) {
            globalWaitlist.add(tempQueue.poll());
        }
        
        if (!assigned) {
            book.incrementCopies();
        }
    }
    
    public void status() {
        System.out.println("Books Availability:");
        for (Book book : books.values()) {
            List<String> waitlistArray = new ArrayList<>(book.getWaitlist());
            System.out.println(book.getBookId() + " - \"" + book.getTitle() + "\" - Available Copies: " + 
                             book.getAvailableCopies() + " - Waitlist: " + waitlistArray);
        }
    }
    
    public void userStatus(String userId) {
        User user = users.get(userId);
        if (user == null) {
            System.out.println("Invalid user ID");
            return;
        }
        System.out.println("Books borrowed by " + userId + ": " + user.getBorrowedBooks());
    }
}

public class Assignment {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.borrow("U001", "B001");
        library.borrow("U002", "B001");
        library.borrow("U003", "B001");
        library.borrow("U004", "B002");
        library.borrow("U001", "B002");
        library.borrow("U005", "B002");
        library.borrow("U006", "B002");
        library.returnBook("U002", "B001");
        library.borrow("U003", "B002");
        library.status();
        library.userStatus("U001");
        library.userStatus("U003");
    }
}