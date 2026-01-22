import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //given number is positive negative and zero
        int n=18;
        if(n>0){
            System.out.println("positive number!");
        }else if(n<=0){
            System.out.println("negative number!");
        }else{
            System.out.println("zero number!");
        }
        System.out.println();
        //check the number is even or odd
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        System.out.println();
        //print largest number
        int a=10,b=20,c=30;
        if(a>=b && a>=c){
            System.out.println("a is largest");
        }else if(b>=c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
        System.out.println();
        //print factroial number
        int n1=10;
        int fact=1;
        for(int i=1;i<=n1;i++){
            fact*=i;
        }
        System.out.format("factorial of "+ n1 + ":" + fact);
        System.out.println();
        System.out.println();
        //find the leap year
        System.out.print("enter the year:");
        int year=sc.nextInt();
        if((year%4==0 || year%400==0) && year%100!=0){
            System.out.println("it is a leap year!");
        }else{
            System.out.println("it is not a leap year!");
        }
        System.out.println();
        //check the vowles and consonants
        System.out.print("enter the string:");
        String str=sc.next();
        char ch=str.toLowerCase().charAt(0);
        if(str.equals("a") || str.equals("i") || str.equals("e") || str.equals("o") || str.equals("u")){
            System.out.println("vowles:"+str);
        }
        sc.close();
    }
}
