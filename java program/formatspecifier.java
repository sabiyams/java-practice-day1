public class formatspecifier {
    public static void main(String[] args) {
        int ival=2345;
        double fval=234.5678;
        char cval='a';
        boolean bval=true;
        String sval="hello world";
        //interger format specifiers
        /*the type of integers are decimal(10),octal(8),hexadecimal(16)*/
        System.out.println();
        System.out.printf("integer(decimal):%d\n",ival);//op:2345
        System.out.printf("integer(octal):%o\n",ival);//po:4451
        System.out.printf("integer(hexadecimal):%x\n",ival);//op:929
        System.out.printf("integer(hexadecimal):%X\n",ival);//op:929
        System.out.println();
        //floating format specifier
        /*floating types are general,scientafic,hexadecimal,and both general,hexadecimal*/
        System.out.printf("float(general):%g\n",fval);//234.567000(the geneal form display the point after the 6 digits)
        System.out.printf("float(scientafic):%e\n",fval);
        System.out.printf("float(scientafic):%E\n",fval);
        System.out.printf("float(general,scientafic):%g\n",fval);/*the g is decrease the after the point to decimal values
        it give the hight values after the decimal points it always dispaly the general form*/
        double floatingval=10000000.0;
        System.out.printf("float(general,scientafic):%G\n",fval);//G is represent the scientafic form
        System.out.printf("float(hexadecimal):%a\n",floatingval);
        System.out.printf("float(hexadecimal):%A\n",floatingval);
        System.out.println();
        //character formating specifiers
        System.out.printf("character:%c\n",cval);/*the small c represent the original value op:a*/
        System.out.printf("character:%C\n",cval);/*capital C is represet the orginal character of the capital op:A*/
        System.out.println();
        //string formating specifiers
        System.out.printf("string:%s\n",sval);/*small s behave like small c op:hello world*/
        System.out.printf("string:%S\n",sval);/*capital S represent the behave like capital C op:HELLO WORLD*/
        System.out.println();
        //boolean formating specifier
        System.out.printf("boolean:%b\n",bval);/*small b behave like small c op:true*/
        System.out.printf("boolean:%B\n",bval);/*capital B behave like capital C op:TRUE*/
        System.out.println();
        //hash code formating specifiers
        System.out.printf("hash code:%h\n",sval);
        System.out.printf("hash code:%H\n",sval);
        System.out.printf("hash code:%H\n",10.20293838);
        System.out.println();
        //percentage formating specifier
        double per=18.14569;
        System.out.printf("percentage:%g%%\n",per);//the percentage symbol work two times percatage
    }
}
