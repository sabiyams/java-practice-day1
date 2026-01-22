import java.util.Scanner;
public class prime1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        //for loop is check the each number is divisble or not
        for(int i=2;i<=a;i++){
            if(a%i==0){
            //if it divisable then will count
            count++;
        }
        }
        /*some numbers are divisable 3,4 numbers so we want only divisable one are itself
        we write count ==2*/
        if(count==2){
            System.out.println( a + " it's a prime number!");
        }else{
        System.out.println( a + " it's not a prime number!");
        }
        System.out.println();
        sc.close();
    }
}
