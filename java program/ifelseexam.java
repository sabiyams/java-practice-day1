import java.util.Scanner;
public class ifelseexam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.printf("enter a number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("given number is divisable by 2");
        }else{
            System.out.println("given number not divisable by 2");
        }
        System.out.println();
        sc.close();
    }
}
