import java.util.*;

public class Prblm1{
    //method
    static void evennumbers(int n){
        for(int i=0;i<=n;i+=2){
            // if(i%2==0){
                System.out.println(i);
            // }
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evennumbers(n);
        sc.close();
    }
}