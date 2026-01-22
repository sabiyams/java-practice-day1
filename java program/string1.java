import java.util.Arrays;
public class string1 {
    public static void main(String[] args) {
        String str="hello";
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
        System.out.println();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
        System.out.println();
        String str1="madam";
        String rese="";
        for(int i=str1.length()-1;i>=0;i--){
            rese+=str1.charAt(i);
        }
            if(str1.equals(str1)){
                System.out.println("ture");
            }else{
                System.out.println("false");
            }
        System.out.println();
        //find max in an array
        int[] arr={3,1,7,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        //another example
        int[] arr1={10,20,30,30,40};
        int Max=Arrays.stream(arr1).max().getAsInt();
        System.out.println(Max);
        //sum of array
        int[] arr2={2,4,6};
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }
        System.out.println(sum);
        //liner search
        int[] arr3={10,20,30,40};
        int target=30;
        int index=-1;
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("not found");
        }
        System.out.println();
    }
}
