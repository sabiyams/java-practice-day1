import java.util.*;
public class Aq2{
    //method 
    public static double threenumberavg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(threenumberavg(a,b,c));
        sc.close();
    }
}