import java.util.Scanner;;
public class example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter you'r name:");
       /*  here we use next they will read string without space so the 
       garbage will give next input automatically so we use nextline*/
        String name=sc.nextLine();
        //the nextline will read string with space
        System.out.print("enter you'r address:");
        String address=sc.nextLine();
        System.out.println("Name="+name);
        System.out.println("Address="+address);
        sc.close();
    }
}
