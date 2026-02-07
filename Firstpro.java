import java.util.*;
public class Firstpro {
	//method
	public static int maxArr(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res=maxArr(arr);
		System.out.print(res);
		sc.close();
	}

}
