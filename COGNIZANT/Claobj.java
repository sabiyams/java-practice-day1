import java.util.Arrays;
import java.util.*;
class Student{//consturactor name same as class name
    String name;
    int roll_number;
    int[] marks;
    //creation methods
        public void display_details(){
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + roll_number);
            System.out.println("Marks: " + Arrays.toString(marks));
        }
        public void calculate_average(){
            int sum=0;
            for(int i=0;i<marks.length;i++){
                sum+=marks[i];
            }
            double avg= (double) sum/marks.length;
            System.out.println("Average Marks: " + avg);
        }
}
    //main method
    public class Claobj{
        public static void main(String[] args){
            Student s=new Student();
            Scanner sc=new Scanner(System.in);
            System.out.print("Name: ");
            s.name=sc.nextLine();
            System.out.print("Roll Number: ");
            s.roll_number=sc.nextInt();
            int size=sc.nextInt();
            s.marks=new int[size];
            System.out.print("Marks: ");
            for(int i=0;i<size;i++){
                s.marks[i]=sc.nextInt();
            }
            s.display_details();
            s.calculate_average();
            sc.close();
        }
    }

