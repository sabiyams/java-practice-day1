
//sum of two numbers
import java.util.*;
class Main {
    //method 
    public static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    //multipule of two number return they product
    public static int Multipule(int n1,int n2){
        int mutl=n1*n2;
        return mutl;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=Sum(a,b);
        System.out.println(res);
        //multipule main code
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res1=Multipule(n1, n2);
        System.out.println(res1);
        sc.close();
    }
}
