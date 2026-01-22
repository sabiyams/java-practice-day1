import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter staring number:");
        int n1=sc.nextInt();
        System.out.print("enter ending number:");
        int n2=sc.nextInt();
        //condition
        System.out.println("leap year between" + n1 + "and" + n2 + ":");
        for(int year=n1;year<=n2;year++){
            if((year%400 == 0) || ((year%4 == 0) && (year%100!=0))){
                System.out.println(year);
            }
        }
        sc.close();
    }
}
