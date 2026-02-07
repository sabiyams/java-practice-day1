public class Meargesorting {
    static void merge(int[] arr,int n,int r,int l,int m){
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k]=L[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    static void mergesort(int[] arr,int n,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesort(arr, n,l,m);;
            mergesort(arr, n, m+1,r);
            merge(arr,n,l,r,m);
        }
    }
    public static void main(String[] args) {
        int[] arr={22,33,44,55,334,556,7688};
        int n=arr.length;
        merge(arr, 0, 0, 0, 0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
