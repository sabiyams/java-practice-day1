import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=20;
        // for(a=1;a<=20;a++){
        //     System.out.printf("%d\n",a);
        // }
        /*we also write inshalization "int a=10;"for(; ;)"you don't write
         condition it will take automatically infinate you also declare for loop after the increment
         for example int a=10;
         for(; ;);
         a++;*/
         System.out.println();
         System.out.print("enter a number:");
         int n=sc.nextInt();
         int count=0;
         for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
         }
        if(count==2){
            System.out.println("it's prime");
        }else{
            System.out.println("it's not prime number");
        }
        sc.close();
    }
}
