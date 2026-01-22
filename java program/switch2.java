import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter month number:");
        int month=sc.nextInt();
        var monthname=switch (month) {
            case 1,2,11,12->"it's winter";
            case 3,4,5,6->"it's summer";
            case 7,8,9,10->"it's rainy";
            default->null;
        };
            if(monthname==null){
                System.out.println("inavlid month number!");
            }else{
                System.out.println("it a"+monthname);
            }
        System.out.println();
        sc.close();
    }
}
