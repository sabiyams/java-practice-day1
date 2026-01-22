import java.util.Scanner;
public class tenary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("what's your name:");
        String name=sc.nextLine();
        System.out.print("what's your age:");
        int age=sc.nextInt();
        String vote=String.format("your eligible for vote",name);
        String non_vote=String.format("your age is enuogh so not eligible for vote",age);
        System.out.println(age>=18? vote:non_vote);
        sc.close();
    }
}
