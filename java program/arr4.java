import java.util.Scanner;
public class arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //create array
        int[][] a=new int[5][4];
        //input
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                System.out.printf("enter value for row%d, col%d:",row+1,col+1);
                a[row][col]=sc.nextInt();
            }
            //output
            /*java does't allow the two variables with the same name in the same scope
             * we have to change one of the variable so we rename row has currentrow 
             */
            for(int[] currentrow:a){
                for(int col:currentrow){
                    System.out.printf("%4d",col);
                }
            }
        }
        sc.close();
    }
}

