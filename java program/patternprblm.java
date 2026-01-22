import java.util.Scanner;
public class patternprblm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*" + " ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // // }
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*" );
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
