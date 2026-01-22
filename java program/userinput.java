import java.util.Scanner;
/*java is a main package name
 util is a sub package name
 scanner is a class
 */
//class is a provides diffrente type of methods or function 
//"methods read differebt type of data type"
public class userinput {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        //the system.in purpose to read the value from the keybord
        System.out.print("enter a value:");
        int a=Sc.nextInt();
        System.out.print("enter b value:");
        int b=Sc.nextInt();
        int add=a+b;
        System.out.println("Addition:"+add);
        Sc.close();
        //you must be close the compltetion of your conditions
        
    }
}
