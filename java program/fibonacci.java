public class fibonacci {
    public static void main(String[] args) {
        //initilaization the first second numbers
        System.out.println();
        int n=10;
        int first=0;
        int second=1;
        System.out.println("Fibonacci of number " + n + " term");
        //using for loop beacuse read all numbers
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
           int next=first+second;
           first=second;
           second=next;
        }
        System.out.println();
    }
}
