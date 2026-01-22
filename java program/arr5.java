import java.util.Arrays;
public class arr5 {
    public static void main(String[] args) {
        //array initilaization 
        int[] x={12,234,567,889,766,54,44,33,22,111};
        int[] y={12,234,567,889,766,54,44,34,22,111};
        System.out.println();
        System.out.println("value of x:" +Arrays.toString(x));
        System.out.println("value of x:" +Arrays.toString(y));
        System.out.println();
        //arrays.equal this function is use to compare two array are equal or not
        System.out.println("array x == array y:" + (Arrays.equals(x,y) ? "Yes" : "No")); 
        System.out.println();
    }
}
