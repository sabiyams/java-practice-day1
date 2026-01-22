public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //another example
        System.out.println();
        for(int x=1;x<=5;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
} 
