import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double half=0.5f;
        System.out.print("enter your base:");
        int base=sc.nextInt();
        System.out.print("enter your height:");
        int height=sc.nextInt();
        double area=half*base*height;
        System.out.println("area of triangle="+area);
        sc.close();
    }
}
