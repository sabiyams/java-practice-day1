public class typesvar {
    int a;
    static int b;
    public static void main(String[] args) {
        /*here must be and should be instance,static variable same class name  */
        typesvar ob1=new typesvar();
        typesvar ob2=new typesvar();
        ob1.a=10;
        ob2.b=20;
        int c;
        c=30;
        System.out.println("instance a="+ ob1.a);
        System.out.println("static b=" + ob2.b);
        System.out.println("local c="+ c);
    }
}
