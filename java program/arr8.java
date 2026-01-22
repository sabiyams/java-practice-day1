import java.util.Arrays;
import java.util.Scanner;
public class arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x={123,234,345,456,567,678,789,99,88};
        System.out.println("array before sorting x:" + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("array after sorting x:" + Arrays.toString(x));
        System.out.println();
        System.out.print("enter number to search for:");
        int a=sc.nextInt();
        int idx=Arrays.binarySearch(x, a);
        String found=String.format("value %d is found at position %d:",a,idx);
        String notfound=String.format("value %d is not foun",a,idx);
        System.out.println();
        System.out.println(idx>=0?found:notfound);
        System.out.println();
        sc.close();
    }
}
