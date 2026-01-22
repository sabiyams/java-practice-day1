import java.util.*;

public class Prblm2{
    //method 
    static void gradeprinter(int marks){
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=75 && marks<90){
            System.out.println("B");
        }else if(marks>=60 && marks<75){
            System.out.println("C");
        }else if(marks>=40 && marks<60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        gradeprinter(marks);
        sc.close();
    }
}