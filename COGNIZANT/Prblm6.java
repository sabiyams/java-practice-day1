import java.util.*;
public class Prblm6{
    public static void fibonacci(int first,int second,int n){
        System.out.print(first + " " + second);
        for(int i=2;i<n;i++){
            int sum=first+second;
            first=second;
            second=sum;
            System.out.print(sum + " ");
        }
    }                
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(0, 1 , n);
        sc.close();
    }
}