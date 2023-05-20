import java.util.Scanner;

public class FibonaciRecursion {
	static int fibRecursion(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return fibRecursion(n-1)+fibRecursion(n-2);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many fibonaci number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print(fibRecursion(i)+" ");
		}
	}
}
