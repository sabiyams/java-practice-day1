import java.util.Scanner;
public class for3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //find even number between the range
        System.out.print("enter starting value:");
        int n1=sc.nextInt();
        System.out.print("enter ending value:");
        int n2=sc.nextInt();
        if(n1<n2){
            for(int i=n1;i<=n2;i++){
                if(i%2==0)
                    System.out.printf(" %d ",i);
                }
        }
        sc.close();
    }
    
}
