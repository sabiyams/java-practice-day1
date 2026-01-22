import java.util.Scanner;
public class relational {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter first number:");
        int a=sc.nextInt();
        System.out.printf("enter second number:");
        int b=sc.nextInt();
        System.out.println();
        System.out.printf("%d < %d:%b\n",a,b,a<b);//32<42=ture
        System.out.printf("%d > %d:%b\n",a,b,a>b);//32>42=false
        System.out.printf("%d <= %d:%b\n",a,b,a<=b);//32<=42=ture
        System.out.printf("%d >= %d:%b\n",a,b,a>=b);//32>=42=false
        System.out.printf("%d == %d:%b\n",a,b,a==b);//32==42=false
        System.out.printf("%d != %d:%b\n",a,b,a!=b);//32!=42=ture
        sc.close();
    }
}
