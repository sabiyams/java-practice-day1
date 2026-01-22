public class converstion {
    public static void main(String[] args) {
        int a,b;
        float A,B;
        /*convertion it is a automatic converstion and this type is called
         implicit converstion and it is convert from smaller to larger data types*/
         //the narrowing is convert to larger to smaller data types
         a=1418;
         A=a;
         System.out.println("integer value:"+a);
         System.out.println("converting to float:"+A);
         System.out.println();
         /*casting it is a manuval converstion and this tyoe is called 
         explicit converstion and it is convert from larger to smaller data types*/
         //the widening is convert to smaller to larger data types
         B=1234.5678f;
         b=(int)B;
         System.out.println("floating value:"+B);
         System.out.println("casting to int:"+b);
        //  int num=10;
        //  String str="123";
        //  //the int is convert to string
        //  String str1=String.valueOf(num);
        //  System.out.println("the value of:"+str1+str);
    }
}
