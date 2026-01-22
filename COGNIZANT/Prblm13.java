//prime number check
import java.util.*;
public class Prblm13 {
    //method

    public static String prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return "prime";
        }else{
            return "not prime";
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
        sc.close();
    }
}
