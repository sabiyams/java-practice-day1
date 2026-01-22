import java.util.Scanner;
public class elseifexam {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter your marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("your grade is A");
        }else if(marks>=80 && marks<=89){
            System.out.println("your grade is B");
        }else if(marks>=70 && marks<=79){
            System.out.println("your grade is C");
        }else if(marks>=60 && marks<=69){
            System.out.println("your grade is D");
        }else{
            System.out.println("your grade is F");
        }
        System.out.println();
        sc.close();
    }
}
