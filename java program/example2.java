import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter you'r age:");
        int age=sc.nextInt();
        sc.nextLine();
        //it consume the newline character left by nextint
        System.out.print("enter you'r name:");
        String name=sc.nextLine();
        //nextline it's read the string with space
        // System.out.print("anter you'r age:");
        // int age=sc.nextInt();
        System.out.println("name="+name);
        System.out.println("age="+age);
        sc.close();
    }
}
