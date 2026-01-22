import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print hello world
        System.out.println("Hello, World!");
        System.out.println();
        //Find the sum of three numbers
        System.out.print("enter a value:");
        int a=sc.nextInt();
        System.out.print("enter b value:");
        int b=sc.nextInt();
        System.out.print("enter c value:");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("sum:" + sum);
        System.out.println();
        sc.close();
    }
}
