import java.util.Scanner; 
public class evenodd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("given number is even!");
        }else{
            System.out.println("given number is odd!");
        }
        System.out.println();
        sc.close();
    }
}
