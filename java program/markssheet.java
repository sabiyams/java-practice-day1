import java.util.Scanner;
public class markssheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        //take user to input
        System.out.printf("%-20s:","enter Roll Number");
        int rno=sc.nextInt();
        sc.nextLine();//it is consume the garbage 
        System.out.printf("%-20s:","enter Name");
        String name=sc.nextLine();
        //initilaization the all subjects,percentage,grade
        int hin,eng,mat,sci,soc,com,total;
        double per;
        char grade;
        System.out.println();
        //take all subjects marks to user
        System.out.println("enter all subject's marks");
        System.out.println("----------------------------------");
        //here we use dowhile loop
        do{
            System.out.printf("%-20s:","Hindi Marks");
            hin=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(hin<0 || hin>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(hin<0 || hin>100);
     do{
            System.out.printf("%-20s:","English Marks");
            eng=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(eng<0 || eng>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(eng<0 || eng>100);
     do{
            System.out.printf("%-20s:","Maths Marks");
            mat=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(mat<0 || mat>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(mat<0 || mat>100);
     do{
            System.out.printf("%-20s:","Science Marks");
            sci=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(sci<0 || sci>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(sci<0 || sci>100);
     do{
            System.out.printf("%-20s:","Social Marks");
            soc=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(soc<0 || soc>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(soc<0 || soc>100);
     do{
            System.out.printf("%-20s:","Computer Marks");
            com=sc.nextInt();
        //the marks must be 0 to 100 so we use if condition
        if(com<0 || com>100){
            //if in case user enter defalut number so we have some msg they will get correct number
            System.out.println("marks must be between o and 100.");
            System.out.println("Try again......");
        }
    }while(com<0 || com>100);
    //we have total marks and percentage also
    total=hin+eng+mat+sci+soc+com;
    per=total*100/600;
    //if in case user all subjects pass we write this condition
    boolean ispass=hin>=35 && eng>=35 && mat>=35 && sci>=35 && soc>=35 && com>=35;
    //if all condition is true print grade
    if(ispass){
        if(per>=75)
        grade='A';
        else if(per>=60 && per<75)
        grade='B';
        else if(per>=45 && per<60)
        grade='C';
        else
        grade='D';
    }
    else
    grade='F';
    //i want to roll number so specific width 
    String sRno=String.format("%08d",rno);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sHin=hin<35? String.format("%2dF", hin):String.format("%3d", hin);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sEng=eng<35? String.format("%2dF", eng):String.format("%3d", eng);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sMat=mat<35? String.format("%2dF", mat):String.format("%3d", mat);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sSci=sci<35? String.format("%2dF", sci):String.format("%3d",sci);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sSoc=soc<35? String.format("%2dF", soc):String.format("%3d", soc);
    //if in case user fail hin i want f letter so i will write 2f are 3digit number print
    String sCom=com<35? String.format("%2dF", com):String.format("%3d", com);
    /*if user pass all i want to print there marks,name,rollnumber,grade,percentage and 
    congratulation msg and sorry msg*/
    if(ispass){
        //all information print like box so will write like that
        System.out.printf("+---------------------------------------------+\n");
        System.out.printf("%-18s: %-25s|\n","Roll Number",sRno);
        System.out.printf("%-18s: %-25s|\n","Enter Name",name);
        System.out.printf("+-------+-------+-------+-------+-------+-----+\n");
        System.out.printf("|  HIN  |  ENG  |  MAT  |  SCI  |  SOC  | COM |\n");
        System.out.printf("|  %s  |  %s  |  %s  |  %s     %s  | %s |\n",sHin,sEng,sMat,sSci,sSoc,sCom);
        System.out.printf("+-------+-------+-------+-------+-------+-----+\n");
        System.out.printf("|                                              |\n");
        System.out.printf("|                CONRATULACTION                |\n");
        System.out.printf("|                   YOU PASSED!                |\n");
        System.out.printf("|                                              |\n");
        System.out.printf("+-------------------------------+--------------+\n");
        //we want tottal marks,grade and percentage
        //here totalmarksobtained width is 13 so we write width also
        System.out.printf("| TOTAL MARKS OBTAINED |         %13d |\n",total);
        //here percentage with before after space total width 12 after point we wont only print two numbers
        System.out.printf("| PERCENTAGE           |         %12.2f%% |\n",per);
        //here grade is 13 width i want
        System.out.printf("| GRADE                |         %13c |\n",grade);
        System.out.printf("+----------------------------------------------+\n");
    }else{
        System.out.printf("+----------------------------------------------+\n");
        System.out.printf("%-18s:  %-25s |\n","Roll Number",sRno);
        System.out.printf("%-18s:  %-25s |\n","Enter Name",name);
        System.out.printf("+-------+-------+-------+-------+-------+-----+\n");
        System.out.printf("|  HIN  |  ENG  |  MAT  |  SCI  |  SOC  | COM  |\n");
        System.out.printf("|  %s  |  %s   | %s  |  %s  |  %s  | %s  |\n",sHin,sEng,sMat,sSci,sSoc,sCom);
        System.out.printf("+-------+-------+-------+-------+-------+-----+\n");
        System.out.printf("|                                              |\n");
        System.out.printf("|                    SORRY                     |\n");
        System.out.printf("|                   YOU FAILED!                |\n");
        System.out.printf("|                                              |\n");
        System.out.printf("+-------------------------------+--------------+\n");
        //we want tottal marks,grade and percentage
        //here totalmarksobtained width is 13 so we write width also
        System.out.printf("| TOTAL MARKS OBTAINED |          %13d |\n",total);
        //here percentage with before after space total width 12 after point we wont only print two numbers
        System.out.printf("| PERCENTAGE           |          %12.2f%% |\n",per);
        //here grade is 13 width i want
        System.out.printf("| GRADE                |          %13c |\n",grade);
        System.out.printf("+----------------------------------------------+\n");
        System.out.println();
    }
    sc.close();
}
}
