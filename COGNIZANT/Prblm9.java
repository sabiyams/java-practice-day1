import java.util.*;
public class Prblm9{
    //method
    static void palindrome(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
         if(n==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
        sc.close();
    }
}