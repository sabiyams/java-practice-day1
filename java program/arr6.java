import java.util.Arrays;
public class arr6 {
    public static void main(String[] args) {
        //array initilaization
        int[] x={123,334,55566,666,777,77,88,89};
        int[] y={123,334,555,888,777,77,88,89};
        System.out.println();
        System.out.println("array of x:" + Arrays.toString(x));
        System.out.println("array of x:" + Arrays.toString(y));
        //array.compare this function use to compare two arrays return output 3 forms 
        /*returns +ve if x>y 
        returns -ve if x<y
        returns 0 x==y
        */
        if(Arrays.compare(x,y)>0){
            System.out.println("array x > array y");
        }else if(Arrays.compare(x,y)<0){
            System.out.println("array x < array y");
        }else{
            System.out.println("array x == array y");
        }
        System.out.println();
    }
}
