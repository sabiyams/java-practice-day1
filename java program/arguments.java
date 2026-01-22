public class arguments {
    public static void main(String[] args) {
        int a=14,b=18;
        System.out.println(a+ "+" +b+ "=" +(a+b)+ "," +a+ "-" +b+ "=" +(a-b));
        //the argument number we will give 
        System.out.printf("%1$d+%2$d=%3$d , %1$d-%2$d=%4$d\n",a,b,a+b,a-b);
        //the < symbol is take the last format of last exprection and it will take the left side of the number 
        System.out.printf("%d %<d %<d - %d %<d %<d",a,b);

    }
}
