import java.util.*;
public class Aq4 {
    //method
    public static int gratestnum(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gratestnum(a, b));
        sc.close();
    }
}
