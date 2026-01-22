public class postpre1 {
    public static void main(String[] args) {
        int a=5;
        int b=a++ + ++a;
        System.out.println(b);//output:12
        System.out.println();
        int a1=10;
        //here frist assign value the 10 increment(11) a++=10
        //here second already incerement above 11 then it will increment(12) a++=11(postincrement is assign the value first)
        //here third preincrement it will decrement --a=12-1=>11
        //output=10+11+11=>32
        int a2=a1++ + a1++ + --a1;
        System.out.println(a2);//32
        System.out.println();
        int a3=a1++ + ++a1 * a1--;
        System.out.println(a3);//180
        System.out.println();
        int i=4;
        int j=3;
        int k=(i-- + j++) * ++i;
        System.out.println(k); //28
        System.out.println();
        boolean a4=(a1<5) || (a1++<20);
        System.out.println(a4);//ture
        System.out.println();
        boolean a5=(a1<5) && (a1++<20);
        System.out.println(a5);//false
        System.out.println();
        int a6=5;
        boolean a7=(a6++==5) & (a6++==6);
        System.out.println(a7);//ture
        System.out.println();
        boolean a8=true^false^true;
        //1^0=1 , here 1^1=0 "ture^ture=false"
        System.out.println(a8);
        System.out.println();
        int a9=10;
        a9*=2+3;
        System.out.println(a9);//50
        System.out.println();
        int a10=10;
        a10+=128;
        System.out.println(a10);//138
        System.out.println();
        int a11=10;
        System.out.println((byte)(a11+1));
        System.out.println();
        int a12=5;
        System.out.println(a12++ + ++a12);//12
        System.out.println();
        int a13=5;
        int a14=5;
        System.out.println(a13++==a14-- && a13==a14);//ture
        System.out.println();
        System.out.println(-10%3);//-1
        System.out.println();
        System.out.println(3+5*2/4%3);//
        //42
        System.out.println((1+2)*3-4/2);//output:7
        //41
        System.out.println(10%4+1);//output:3
        //40
        System.out.println(10+10-10*10);//output:80;
        //39
        System.out.println(5*3+2);//output:17
        //38
        System.out.println(8|2);/*here 8 binary code 1000 and 2 binary code is 0100 =1100(10) */
        //37
        System.out.println(10>5 ? 10<20 ? "yes":"no":"maybe");//yes
        //36
        int s=4,m=6;
        int s1=(4<6)?s++:++m;
        System.out.println(s1+""+s+""+m);//456
        //35
        System.out.println((3>0)?((3<5)?"small":"big"):"zero");
        //34
        System.out.println((5>10)?"A":"B");//B
        //33
        float f=0.1f;
        double d=0.1;
        System.out.println(f==d);//false
        //32
        char c='A';
        int I=65;
        System.out.println(c==I);//ture
        //31
        System.out.println(10>5 && 20<10);//false
        //30
        //we want write hello.equlas(new string("hello"))"this is ture"
        System.out.println("hello"==new String("hello"));//ture
        //29
        int IN=5;
        double D=5.0;
        System.out.println(IN==D);//ture
        //28
        System.out.println(true || false && true);//itwill check false&ture then false then ture||false=ture
        //27
        System.out.println(!(true && false || false));//t&&f=f|f=fnot(f)=ture
        //26
        System.out.println(10<5 && a11++<20);//false
        //25
        System.out.println(a11++ + ++a11);//22
        //24
        int sa=20;
        System.out.println(a11>20?a11++:sa++);//20
    }
}
