import java.util.*;
public class Prblm5{
    //method
    static int sumofdigit(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=n%10;//here last will be come
            n=n/10;//here delee the last digit
        }
        return sum;
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigit(n));
        sc.close();
    }
}