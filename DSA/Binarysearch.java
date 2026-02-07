public class Binarysearch {
    static int binarysearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid=1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={23,34,56,78,87,65,433};
        int target=78;
        int result=binarysearch(arr,target);
        if(result==-1){
            System.out.println("not found");
        }else{
            System.out.println("found: " + result);
        }
    }
}
