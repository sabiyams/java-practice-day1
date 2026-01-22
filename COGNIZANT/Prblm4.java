import java.util.*;

public class Prblm4{
    //method
    static String primenum(int n){
        for(int i=0;i<=n;i++){
            if(i%1==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primenum(n));
        sc.close();
    }
}
