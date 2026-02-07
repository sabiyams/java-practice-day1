public class Bubblesorting {
    //create method
    //if you write this sorting you must have the arr and 
    static void bubblesort(int[] arr, int n){
        //we create the three variables to swapped
        int i,j,temp;
        boolean swapped=false;
        //inner loop
        for(i=0;i<n-1;i++){
            swapped=false;
            //outer loop
            /*here j<n-i-1 the j loop check the only first i is check and swapped
             then already swapped yhe number so we don't know the then again don't swappwd so that why we give j<n-i-1*/
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={50,40,30,20,10};
        int n=arr.length;
        bubblesort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
