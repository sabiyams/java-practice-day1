import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        /*read the number and divide with 2 then increment*/
        int sum=0;
        for(int i=1;i<=n/2;i++){
            sum=sum+i;
        }
        //if sum==given number that is perfect number
        if(sum==n){
            System.out.println(n + " is a perfect number");
        }else{
            System.out.println(n + " is not perfect number");
        }
        sc.close();
    }
}
