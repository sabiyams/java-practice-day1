import java.util.Scanner;
public class ifexam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("given number divisable by two");
        }
        System.out.println();
        sc.close();
    }   
}
