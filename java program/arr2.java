import java.util.Scanner;
public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create arr
        int[] a=new int[5];
        //access the arr
        //input
        for(int i=0;i<a.length;i++){
            /*we use length function because user will take so many numbers but we can't to
            acces each number but length wiil acess the each number  */
            System.out.printf("Enter value %d:",i+1);
            a[i]=sc.nextInt();
        }
        //output
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.printf(" %d ", a[i]);
        }
        System.out.println();
        System.out.println();
        sc.close();
    }
}
