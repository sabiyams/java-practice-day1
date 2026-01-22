import java.util.*;
import java.util.Arrays;
public class Aq1{
    //method
    static void largestele(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        sc.close();
    }
}