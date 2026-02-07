import java.util.*;
class Inserationlist{
    //sorting in ascending
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,2,8,1,9,3};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:arr){
            a.add(i);
        }
        Collections.sort(a);
        System.out.println(a);
        //descending order
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        //alahabatical 
        String[] str={"zara","alice","bob"};
        ArrayList<String> b=new ArrayList<>();
        for(String j: str){
            b.add(j);
        }
        Collections.sort(b);
        System.out.println(b);
        //strings in decsing order
        String[] str1={"apple","hi","banana","a","cher"};
        AbstractList<String> c=new ArrayList<>();
        for(String k:str1){
            c.add(k);
        }
        Collections.sort(c,Collections.reverseOrder());
        System.out.println(c);
        //sort by the length
        String[] str2={"zara","alice","bob","christopher","tom"};
        ArrayList<String> d=new ArrayList<>();
        for(String l:str2){
            d.add(l);
        }
        Collections.sort(d,Comparator.comparing(String::length));
        System.out.println(d);
        //decsing order
        Collections.sort(d,(s1,s2)->s2.length()-s1.length());
        System.out.println(d);
    }
}
