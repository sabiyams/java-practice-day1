public class for2 {
    public static void main(String[] args){
        //print 1-100 numbers
        for(int i=1;i<=100;i++){
            System.out.printf(" %d ", i);
        }
        System.out.println();
        System.out.println();
        //print 100-1 number 
        for(int x=100;x>=1;x--){
            System.out.printf(" %d ",x);
        }
        System.out.println();
        System.out.println();
        //print 5 to 100 increment to 5
        for(int a=5;a<=100;a+=5){
            System.out.printf(" %d ",a);
        }
        System.out.println();
        System.out.println();
        //print 100 to 5 decrement 5
        for(int b=100;b>=5;b-=5){
            System.out.printf( " %d ",b);
        }
        System.out.println();
        System.out.println();
        //we also write mutltipule conditions in a for loop
        int I;
        float j;
        for(I=1,j=9;I<=9;I++,j--){
            System.out.printf("%d + %.2f=%.2f\n",I,j,I+j);
        }
    }
}