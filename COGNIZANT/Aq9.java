import java.util.*;
public class Aq9{
    //method
    public static int Gcd(int a,int b){
        int mul=1;
        for(int i=1;i<=9;i++){
            if(a%i==0 && b%i==0){
                mul*=i;
            }
        }
        return mul;
    }
    //main method
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Gcd(a,b));
        sc.close();
     }
}