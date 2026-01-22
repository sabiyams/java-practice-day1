import java.util.Calendar;
public class timedate {
    public static void main(String[] args) {
        //time examples
        Calendar c=Calendar.getInstance();
        //the system count the months to zero  
        c.set(2004,1,18,12,45);
        System.out.printf("hour(00-23):%tH\n",c);
        System.out.printf("hour(1-23):%tk\n",c);
        System.out.printf("hour(00-12):%tI\n",c);
        System.out.printf("hour(1-12):%tl\n",c);
        System.out.printf("minutes(00-59):%tM\n",c);
        System.out.printf("seconds(00-60):%ts\n",c);
        System.out.printf("milliseconds(000-999):%tL\n",c);
        System.out.printf("Nanoseconds(000000-999999):%tN\n",c);
        System.out.printf("AM/PM:%Tp\n",c);
        System.out.printf("timezone offset:%tz\n",c);
        System.out.printf("timezone name:%tZ\n",c);
        System.out.printf("seconds from epoch:%ts\n",c);
        System.out.printf("milliseconds:%tQ\n",c);
        System.out.println();
        //date examples
        System.out.printf("weekday name(full):%tA\n",c);
        System.out.printf("weekday name(short):%ta\n",c);
        System.out.printf("month name(full):%tB\n",c);
        System.out.printf("month name(short):%tb\n",c);
        System.out.printf("month name(short):%tA\n",c);
        System.out.printf("Century Number:%tC\n",c);
        System.out.printf("year(4-digits):%tY\n",c);
        System.out.printf("year(2-digits):%ty\n",c);
        System.out.printf("day of the year(000-366):%tA\n",c);
        System.out.printf("month(01-12):%tm\n",c);
        System.out.printf("day(01-31):%td\n",c);
        System.out.printf("day(1-31):%te\n",c);
        System.out.println();
        System.out.printf("%tA,%<tB %<tY %<td - %<tI:%<tM:%<tS %<Tp\n",c);
        System.out.format("%tA,%<tB %<tY %<td - %<tI:%<tM:%<tS %<Tp\n",c);
        String dob=String.format("%tA, %<tB %<td %<tY - %<taI:%<tM:%<tS %<Tp\n",c);
        System.out.println(dob);

    }
}
