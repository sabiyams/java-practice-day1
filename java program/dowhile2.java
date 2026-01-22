import java.util.Scanner;
public class dowhile2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,v;
        int s=0;
        System.out.print("enter a number:");
        n=sc.nextInt();
        v=n;
        while(n>0){
            n=n/10;
            s++;
        }
        System.out.printf("%d has got %d digits(s)",v,s);
        sc.close();;
    }
}
