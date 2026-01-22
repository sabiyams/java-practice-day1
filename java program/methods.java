import java.util.Scanner;
public class methods {
    //q1.sum of the digits
    static int sumDigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;//get last digit
            sum+=rem;//add  the rem
            n=n/10;//delete the last digit
        }
       return sum;
    }
    //q2.check the prime number
    static boolean isprime(int n1){
        if(n1<=1)//it cannot take the 0 ad 1
        return false;
            for(int i=2;i<Math.sqrt(n1);i++){//prime num satrt the 2 and somtimes it take squares also that why we check that also
                if(n1%i==0){
                    return false;
                }
            }
            return true;
    }
    //q3.factorial number
    static int factorial(int n2){
        int fact=1;
        for(int i=1;i<=n2;i++){
            fact*=i;
        }
        return fact;
    }
    //q4.max of three  numbers
    static String maxofthree(int a,int b,int c){
        if(a>=b && a>=c){
            return "a is big";
        }else if(b>=c){
            return "b is big";
        }else{
            return "c is big";
        }
    }
    //q5.palindrome check
    static String ispalindrome(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        if(str.equals(reversed)){
            return "palindrome";
        }else{
            return "not palindrome";
        }
    }
    //q6.fibonacci series
    static int fibonacci(int n3){
        int first=0;
        int second=1;
        int next=0;
        for(int i=2;i<=n3;i++){
            next=first+second;
            first=second;
            second=next;
        }
        return next;
    }
    //q7.greatest common divisor
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;//it give the remainder 
            a=temp;//b become the new value a
        }
        return a;
    }
    //q8.count the vowles
    public static  String countvowles(String str1){
        int count1=0;
        for(int i=0;i<str1.length();i++){
            char ch=Character.toLowerCase(str1.charAt(i));
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                count1++;
            }
        }
        return String.valueOf(count1);//it directly convert the integer
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //q1.calling function
        System.out.print("enter the value:");
        int n=sc.nextInt();
        System.out.println(sumDigit(n));
        //q2.calling function
        System.out.println(isprime(21));
        //q3.calling function
        System.out.print("enter the number:");
        int n2=sc.nextInt();
        System.out.println(factorial(n2));
        //q4.calling method
        System.out.println(maxofthree(10,30,20));
        //q5.call
        System.out.println(ispalindrome("dad"));
        //q6.call
        System.out.println("fibonacci:"+fibonacci(10));
        //q7.call
        System.out.println(gcd(100, 202));
        //q8.
        System.out.println(countvowles("sabiya"));
        sc.close();
    }
}
