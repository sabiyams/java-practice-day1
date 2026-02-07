import java.util.*;
public class Secondpro {
	//method
	public static String revStr(String str) {
		String ch="";
		for(int i=str.length()-1;i>=0;i--) {
			ch+=str.charAt(i);
		}
		return ch;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=revStr(str);
		System.out.println(res);
		sc.close();	
	}
}
