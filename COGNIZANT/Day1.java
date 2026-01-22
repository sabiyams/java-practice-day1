import java.util.Arrays; 
public class Day1 {
    public static void main(String[] args){
        //Write a program to print elements of an array.
        int[] arr={10,20,30,40,50,};
        System.out.println(Arrays.toString(arr));
        //Find the largest element in an array.
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max+=arr[0];
            }
        }
        System.out.println("largest element:"+max);
        //Find the sum of array elements.
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum of the elemets:"+sum);
        //Reverse an array.
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(Arrays.toString(arr));
        }
    }
}
