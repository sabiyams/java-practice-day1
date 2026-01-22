import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class arrayprblm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //if you want print one line even numbers and odd numbers just write two time same loop without else then it will print
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even numbers in arrays:"+arr[i]);
            }else{
                System.out.print("odd numbers in array:"+arr[i]);
            }
        }
        // int[] arr={1,2,3,4,5};
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }
        // int[] arr={1,2,3,4,5};
        // int sum=0;
        // for(int i=1;i<=arr.length;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);
        // //user input
        // int[] arr1=new int[5];
        // System.out.print("enter the elements:");
        // for(int i=0;i<arr1.length;i++){
        // arr1[i]=sc.nextInt();
        // }
        // int sum1=0;
        // for(int i=0;i<arr1.length;i++){
        //     sum1+=arr1[i];
        // }
        // System.out.println(sum1);
        // int[] arr={10,20,30,40};
        // if(arr.length==0){
        //     System.out.println("array is empty");
        // }
        // int max=arr[0];
        // int min=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);
        // System.out.println();
        // //using functions
        // Integer[] arr1={10,20,50,30};
        // int maximun=Collections.max(Arrays.asList(arr1));
        // int minum=Collections.min(Arrays.asList(arr1));
        // System.out.println(maximun);
        // System.out.println(minum);
        // System.out.println();
        // //take user input
        // int[] array=new int[5];
        // System.out.println("enter the elements:");
        // for(int i=0;i<array.length;i++){
        //     array[i]=sc.nextInt();
        // }
        // int maxi=array[0];
        // int mini=array[0];
        // for(int i=1;i<array.length;i++){
        //     if(array[i]>maxi){
        //         maxi=array[i];
        //     }if(array[i]<mini){
        //         mini=array[i];
        //     }
        // }
        // System.out.println(maxi);
        // System.out.println(mini);
        sc.close();
    }
}
