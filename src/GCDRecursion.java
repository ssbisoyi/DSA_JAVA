import java.util.Scanner;

public class GCDRecursion {
	static int gcdRecursion(int a,int b) {
		if(b!=0)
			return gcdRecursion(b,a%b);
		else 
			return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("To find GCD using recursion:");
		System.out.print("Enter 1st number:");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is: "+gcdRecursion(a,b));

	}

}
