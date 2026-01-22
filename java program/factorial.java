import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        int fact=1,i=1;
        while(i<=a){
            i++;
        fact=fact*i;
        }
        System.out.println("factorial of " + a + " is " + fact);
        System.out.println();
        sc.close();
    }
}