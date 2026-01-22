 class bitwise {
    public static void main(String[] args) {
        int a=22;//00010110
        int b=45;//00101101
        System.out.printf("%d & %d=%d\n",a,b,a&b);//00000100=4
        System.out.printf("%d | %d=%d\n",a,b,a|b);//00111111=63
        System.out.printf("%d ^ %d=%d\n",a,b,a^b);//00111011=59
        System.out.printf("~%d\n",~a);//-23
        System.out.printf("%d << %d:%d\n",a,1,a<<1);//00101100=44
        System.out.printf("%d << %d:%d\n",a,2,a<<2);//00101100=88
        System.out.printf("%d << %d:%d\n",a,3,a<<3);//176
        System.out.printf("%d >> %d:%d\n",b,1,b>>1);//01101000=22
        System.out.printf("%d >> %d:%d\n",b,2,b>>2);//11
    }
}