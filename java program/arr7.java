import java.util.Arrays;
import java.util.Comparator;
/*import java.util.comparator this package is help to sort the arrays */
public class arr7 {
    public static void main(String[] args) {
        //array initilaization
        int[] x={664,7373,954,97,989,64,54,243};
        System.out.println();
        System.out.println("array before sorting x:" + Arrays.toString(x));
        //arrays.sort "it sis use to sort some limit length of the arr"
        Arrays.sort(x);
        System.out.println("array after sorting x:" + Arrays.toString(x));
        System.out.println();
        //we also use arrays.parallelsort "it is use to sort the large amount of length
        /*you are sorting ascending or decending order must be use wrapper classes beacuase 
        it only take wrapper class it con't take the primitive datatypes*/
        Integer[] y={664,7373,954,97,989,64,54,243};
        System.out.println();
        Arrays.sort(y,Comparator.naturalOrder());//ascending order
        Arrays.sort(y,Comparator.reverseOrder());//descending order
        System.out.println("value of y after sorting:" +Arrays.toString(y));
        System.out.println();
    }
}
