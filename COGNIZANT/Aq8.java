import java.util.*;
public class Aq8 {
    //method
    public static double raisedpower(int x,int n){
        double res=Math.pow(x, n);
        return res;
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(raisedpower(x, n));
        sc.close();
    }
}
