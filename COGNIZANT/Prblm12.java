//factorial
import java.util.*;
public class Prblm12 {
    //method
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
        //main method
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int res=factorial(n);
            System.out.println(res);
            sc.close();
        }
}
