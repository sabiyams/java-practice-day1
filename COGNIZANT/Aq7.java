import java.util.*;
public class Aq7 {
    //method 
    public static int Infiniteloop(int n){
        int i=1;;
        do{
            i++;
            return i;
        }while(i<=n);
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Infiniteloop(n));
        sc.close();
    }
}
