import java.util.Scanner;
public class areacricle {
    public static void main(String[] args) {
        //find area of circle and circumefreence of circle
        Scanner sc=new Scanner(System.in);
        //constact declaration 
        final float pi=3.14f;
        System.out.print("enter radius:");
        double radius=sc.nextDouble();
        double area=pi*radius*radius;
        double circ=2*pi*radius;
        double diameter=2d;
        System.out.println("area of circle="+area);
        System.out.println("circumefrence of circle="+circ);
        System.out.println("Diamter of cicle="+diameter);
        sc.close();
    }
}
