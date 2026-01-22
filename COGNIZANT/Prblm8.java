import java.util.*;
public class Prblm8{
    //method
    static int reversenumber(int n){
        int rev=0;
        for(int i=0;i<=n;i++){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reversenumber(n));
        sc.close();
    }
}