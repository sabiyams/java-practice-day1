public class sample {
    static void bubblesort(int[] arr,int n){
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={40,50,60,20,10};
        int n=arr.length;
        bubblesort(arr, n);
        for(int i=0;i<n;i++){
              System.out.println(arr[i]+" ");
        }
        
    }
}
