import java.util.Scanner;
public class perfectsqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        double sqrt=Math.sqrt(n);
        if(sqrt==(int)sqrt){
            System.out.println(n +" perfect number!");
        }else{
            System.out.println(n+" not perfect number!");
        }
        sc.close();
    }
}
