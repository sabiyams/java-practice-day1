public class staticvar {
    //decalre the variable
    int i;//instance variable
    static int j;//static variable
    public static void main(String[] args) {
        //create object
        staticvar ob=new staticvar();
        ob.i=10;
        staticvar.j=20;
        System.out.println("static j=" + staticvar.j);
        System.out.println("instance i=" + ob.i);
    }
}
