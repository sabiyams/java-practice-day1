public class flag{
    public static void main(String[] args) {
        //width it is a number
        System.out.println();
        System.out.printf("%20s %10s %19s\n", "NAME", "PHONE", "ADDRESS");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%20s %10s %19s\n", "pathan sabiya", "123456789", "svn colony 8th line");
        System.out.printf("%20s %10s %19s\n", "pathan sharuk khan", "123456789", "svn colony 8th line");
        System.out.printf("%20s %10s %19s\n", "pathan jilani bhasha", "123456789", "svn colony 8th line");
        System.out.println();
        //flag - give the data into a left side
        System.out.printf("%-20s %-10s %-19s\n", "NAME", "PHONE", "ADDRESS");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s %-10s %-19s\n", "pathan sabiya", "123456789", "svn colony 8th line");
        System.out.printf("%-20s %-10s %-19s\n", "pathan sharuk khan", "123456789", "svn colony 8th line");
        System.out.printf("%-20s %-10s %-19s\n", "pathan jilani bhasha", "123456789", "svn colony 8th line");
        //example
        System.out.println();
        System.out.println("+----------------------+------------+---------------------+");
        System.out.printf("| %-20s | %-10s | %-19s |\n", "NAME", "PHONE", "ADDRESS");
        System.out.println("+----------------------+------------+---------------------+");
        System.out.printf("| %-20s | %-10s | %-19s |\n", "pathan sabiya", "123456789", "svn colony 8th line");
        System.out.printf("| %-20s | %-10s | %-19s |\n", "pathan sharuk khan", "123456789", "svn colony 8th line");
        System.out.printf("| %-20s | %-10s | %-19s |\n", "pathan jilani bhasha", "123456789", "svn colony 8th line");
        System.out.println("+----------------------+------------+---------------------+");
        System.out.println();
        //flag + it is show the -ve or +ve numbers
        int ival=10;
        System.out.println();
        System.out.printf("The Value:%+d\n",ival);
        ival=-10;
        System.out.printf("The Value:%+d\n",ival);
        System.out.println();
        //flag 'space' it will show the number with -ve it's display the -ve sign otherwise spacee
        int val=10;
        System.out.printf("the value:% d\n",val);
        System.out.printf("the value:%d\n",ival);
        System.out.println();
        //flag '#' show the octal and hexadecimal with prefix 0 and 0x
        int n=20;
        System.out.printf("decimal:%d\n",n); 
        System.out.printf("octal:%#o\n",n);
        System.out.printf("hexadecimal:%#x\n",n);
        System.out.println();
        //flag '0' it fill the gap to left  0
        long acno=278328948;
        System.out.printf("Account Number:%017d\n",acno);
        System.out.printf("Account Number:HDCEF23455%017d\n",acno);
        System.out.println();
        //flag ',' show numbers in commas
        long l=1233445567;
        System.out.printf("the value:%,d\n",l);
        System.out.println();
        //flag '(' it show only -ve value with ()
        int x=1418;
        System.out.printf("the value:% (d\n",x);
        x=-1418;
        System.out.printf("the value:% (d\n",x);
    }
}

