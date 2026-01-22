import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter the week number:");
        int week=sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("it is sunday");
                break;
            case 2:
                System.out.println("it is monday");
                break;
            case 3:
                System.out.println("it is tuseday");
                break;
            case 4:
                System.out.println("it is wendsday");
                break;
            case 5:
                System.out.println("it is thursday");
                break;
            case 6:
                System.out.println("it is friday");
                break;
            case 7:
                System.out.println("it is saturday");
                break;
            default:
                System.out.println("invaild week number!");
                break;
        }
        System.out.println();
        sc.close();
    }
}
