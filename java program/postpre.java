public class postpre {
    public static void main(String[] args) {
        int a=15;
        int b=a++;
        /*here first a is assign the b then it will increment but 
        not printed increment value only print assign value*/
        int c=a;
        System.out.println();
        //post increment "first it will assgin the value and it do last experstion"
        System.out.println("post increment:"+b);//15
        System.out.println("post increment:"+c);//16
        int y=++a;
        /*here first increse the value then it will assign so here print the increment value*/
        int z=y;
        //what's the value will increse that value will printed
        System.out.println("pre increment:"+y);
        System.out.println("pre increment:"+z);
        System.out.println();
        int d=10;
        int e=d--;
        /*here first it will assgin the value the it will decrese but it prited only 
        assgining value*/
        int h=e;
        System.out.println("post decrement:"+e);
        System.out.println("pre decrement:"+h);
        int s=--d;
        int m=s;
        System.out.println("post decrement:"+s);
        System.out.println("pre decrement:"+m);
        System.out.println();
        //one more example
        int i=14;
        int k=i++ + ++i;
        /*here we first prefome the pre position that means 
        right side will perfome the first*/
        //the output is ++i is 15 then i++ is increse 15 then 15+15=30
        System.out.println("value of i:"+k);
        System.out.println();
    }
}
