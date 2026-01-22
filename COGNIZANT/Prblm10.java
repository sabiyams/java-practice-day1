//find max element in array input:15,30,40,4,11,9 display higest number indexoutput:2
import java.util.*;
public class Prblm10 {
    public static void main(String[] args) {
        int[] arr={15,30,40,4,11,9};
        int max=arr[0];
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        System.out.println(idx);

    }
}
