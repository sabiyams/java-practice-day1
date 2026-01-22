import java.util.Scanner;
public class conditionstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1
        //check if a number is positive are neagtive
        System.out.print("enter the number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }else if(n<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is zero");
        }
        System.out.println();
        //2
        //check if a number is even or odd
        System.out.print("enter the number:");
        int n1=sc.nextInt();
        if(n1%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
        System.out.println();
        //3
        //if a person is eligible for vote
        System.out.print("enter the age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote");
        }
        System.out.println();
        //4
        //check is a number is divisable by 5
        System.out.print("enter the number:");
        int n2=sc.nextInt();
        if(n2%5==0){
            System.out.println("number is divisible by 5");
        }else{
            System.out.println("not divisible by 5");
        }
        System.out.println();
        //5
        //check if a charcter is vowel or not
        char ch='e';
        if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
            System.out.println("given character is vowel");
        }else{
            System.out.println("given character is not vowel");
        }
        System.out.println();
        //8
        //check character is upper or lower
        char ch1='A';
        if(Character.isUpperCase(ch1)){
            System.out.println("character is upper");
        }else{
            System.out.println("character is lower");
        }
        System.out.println();
        //9
        //string is not empty
        String str="sabiya";
        if(!str.isEmpty()){
            System.out.println("string is not empty");
        }
        //10
        //greater of two numbers
        int num1=10;
        int num2=5;
        if(num1>num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("num2 is greater");
        }
        System.out.println();
        //11
        //check year is leap year is not
        System.out.print("enter the year:");
        int year=sc.nextInt();
        if((year%4==0 || year%400==0) && year%100!=0){
            System.out.println("it is leap year");
        }else{
            System.out.println("it is not a lep year");
        }
        System.out.println();
        //12
        //max of 3 numbers
        int a=10;
        int b=20;
        int c=12;
        if(a>b && b>c){
            System.out.println("a is max");
        }else if(b>c){
            System.out.println("b is max");
        }else{
            System.out.println("c is max");
        }
        System.out.println();
        //13
        //print grades
        int marks=82;
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=75){
            System.out.println("B");
        }else if(marks>=60){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
        //14
        //type of character
        char ch2='#';
        if(Character.isDigit(ch2)){
            System.out.println("digit");
        }else if(Character.isLetter(ch2)){
            System.out.println("letter");
        }else{
            System.out.println("special character");
        }
        System.out.println();
        //15
        //day in month
        int month=2;
        if(month==2){
            System.out.println("28 or 29 days");
        }else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("31 days");
        }else{
            System.out.println("30 days");
        }
        System.out.println();
        //16
        //triangle type
        int x=5;
        int y=5;
        int z=5;
        if(x==y && x==z){
            System.out.println("equilateral triangle");
        }else if(x==y || y==z || x==z){
            System.out.println("isosceles triangle");
        }else{
            System.out.println("scale triangle");
        }
        System.out.println();
        //17
        //temperature categroy
        int temp=32;
        if(temp>35){
            System.out.println("hot");
        }else if(temp>=25){
            System.out.println("normal");
        }else if(temp>=15){
            System.out.println("cool");
        }else{
            System.out.println("cold");
        }
        System.out.println();
        //18
        //scholarship eligibility
        float f=8.5f;
        if(f>=9.0){
            System.out.println("full scholarship");
        }else if(f>=7.0){
            System.out.println("parital scholarship");
        }else{
            System.out.println("no scholarship");
        }
        System.out.println();
        //19
        //divisible by 3 and 5
        int n3=15;
        if(n3%3==0 && n3%5==0){
            System.out.println("divisible by both");
        }else{
            System.out.println("not divisible by both");
        }
        System.out.println();
        //20
        //senior citizen
        int age1=65;
        if(age1>=50){
            System.out.println("senior citizen");
        }
        System.out.println();
        //21
        //exam eligible
        int marks1=70;
        if(marks1>=60){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
        System.out.println();
        //22
        //profit and loss
        int cost=500;
        int selling=700;
        if(cost>selling){
            System.out.println("profit");
        }else if(cost<selling){
            System.out.println("loss");
        }else{
            System.out.println("no profit no loss");
        }
        System.out.println();
        //24
        //check multipule by 10,20,30
        int n4=45;
        if(n4%30 == 0){
            System.out.println(n4+"multipule 30");
        }else if(n4%20==0){
            System.out.println("multipule 20");
        }else if(n4%10==0){
            System.out.println("multipule 10");
        }else{
            System.out.println("not multipule by 30,20,10");
        }
        System.out.println();
        //25
        //number is range 10 to 20
        int n5=15;
        if(n5>=10 && n5<=20){
            System.out.println("number between 10 to 20");
        }else{
            System.out.println("number is out of bouns");
        }
        sc.close();
    }
}
