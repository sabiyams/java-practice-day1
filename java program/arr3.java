import java.util.Scanner;
public class arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //array initilaization
        // int[] a={12,23,456,67,89,90};
        // //acess the array
        // for(int n:a){
        //     System.out.printf(" %d ", n);
        // }
        System.out.print("enter the number:");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
