import java.util.*; 
public class Aq5 {
    //method
    public static double circle(double r){
        return 2 * Math.PI * r;
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println(circle(r));
        sc.close();
    }
}
