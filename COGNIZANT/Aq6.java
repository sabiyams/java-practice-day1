import java.util.*;
public class Aq6 {
    //method
    public static String vote(int age){
        if(age>18){
            return "Eligible";
        }else{
            return "Not Eligible";
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(vote(age));
        sc.close();
    }
}
