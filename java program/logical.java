public class logical {
    public static void main(String[] args) {
        int a=20,b=0;
        System.out.println();
        /*and(&) if number of conditions there but in so many condition they have one condition
         is false all condition will be false 1&1=1 "full conditions are true"
         it will check all conditions are true or flase*/
        if(a>b & a!=b){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        /*or(|) if number of condition thre but in one condition is true they will be
         1|0=1 "one condition become true" it check all conditions*/
        if(a>b | a==b){
            System.out.println("sucess");
        }else{
            System.out.println("failed");
        }
        System.out.println();
        /*and(&&) it check only one conditions but all conditions must and should be true*/
        if(a<b && a/b==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        //or(||) it check only one condition but they have one ture
        if(a<b || a==b){
            System.out.println("sucess");
        }else{
            System.out.println("failed");
        }
        System.out.println();
    }
}
