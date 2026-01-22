import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class arr9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,12,23,35};
        System.out.print("enter the value:");
        int n=sc.nextInt();
        //check all value
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.format("the number " + n + " is found" + " at the index of " + arr[i]);
                break;
            }else{
                System.out.println("array not found");
            }
        }
        sc.close();
    }
}
