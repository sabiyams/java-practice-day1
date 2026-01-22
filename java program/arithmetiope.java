import java.util.Scanner;
public class arithmetiope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a value:");
        //here we take int second value is zero they can't be division by any number so you take float are double
        float a=sc.nextFloat();
        System.out.print("enter b value:");
        float b=sc.nextFloat();
        System.out.println();
        float add=a+b,sub=a-b,mul=a*b,div=a/b,mod=a%b;
        System.out.println("Addition="+add);
        System.out.println("Subtraction="+sub);
        System.out.println("Multipulication="+mul);
        System.out.println("Division="+div);
        System.out.println("Modules="+mod);
        System.out.println();
        sc.close();
    }
}
