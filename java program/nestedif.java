import java.util.Scanner;
public class nestedif {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter a value");
        int a=sc.nextInt();
        System.out.print("enter b value");
        int b=sc.nextInt();
        System.out.print("enter c value");
        int c=sc.nextInt();
        System.out.print("enter d value");
        int d=sc.nextInt();
        //
        if(a>b){
            System.out.printf("%d > %d\n:",a,b);
        }if(a>c){
            System.out.printf("%d > %d\n:",a,c);
        }if(a>d){
        System.out.printf("%d > %d\n:",a,d);
        System.out.println(a+"is largest.");
        }else{
        System.out.printf("%d > %d\n:",a,d);
        System.out.println(d+"is largest.");
        }
        sc.close();
    }
}
