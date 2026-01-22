public class string {
    public static void main(String[] args) {
        String name="sabiya!";
        System.out.println(name);
        System.out.println();
        //we want to string length
        System.out.println("length of the string:"+name.length());
        System.out.println();
        //we want to uppercase letter
        System.out.println("upper case:" + name.toUpperCase());
        System.out.println("lower case:"+name.toLowerCase());
        System.out.println();
        int a=10;
        //add the string and number
        System.out.println(name+a);
        //add with concat function
        System.out.println(name.concat(String.valueOf(a)));
        System.out.println("my name is \'sabiya\'!");
        System.out.println("i am \"20\" years old!");
        System.out.println("my full name is \\pathan sabiya\\");
        System.out.println();
        //how compare two strings
        String str1=new String("sabiya");
        String str2=new String("sabiya");
        //the output will false beacuse they check equal are not it not check inside the content
        System.out.println("string compare:" +(str1==str2));
        /*in string we use to equals() method beacuse it check the inside content 
         so we use equal method to compare the strings*/
         str1.equals(str2);//ture
         System.out.println();
         /*we also use another method also that is equlasIgnoreCase() */
         System.out.println("SABIYA".equalsIgnoreCase("sabiya"));
         System.out.println(name.concat("&"));//sabiya!&
         System.out.println(name.replace("s", "m"));//mabiya
         System.out.println("  sabiya".trim());//remove white space 
         System.out.println("sabi".toCharArray());//convert str into character
         System.out.println(name.charAt(3));//give the value of index
         System.out.println(name.substring(4));
         System.out.println(name.contains("y"));
         System.out.println(name.endsWith("a"));
         System.out.println(name.startsWith("s"));
         System.out.println(name.isEmpty());
        //the append method use add the value or some text
        //the delete method use to delete the content
        //the insert method is use to insert the content
        }
}
