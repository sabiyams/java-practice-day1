import java.util.*;
public class Prblm7{
    //method
    static void righttriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        righttriangle(n);
        sc.close();
    }
}