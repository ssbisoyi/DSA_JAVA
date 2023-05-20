import java.util.Scanner;
public class RecursionFactorial {
	static int factRecurse(int n) {
		if(n>=1)
			return n*factRecurse(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+factRecurse(n));
	}
}
