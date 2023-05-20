import java.util.Scanner;

public class RecursionMenu {
	public static int factRecurse(int n) {
		if(n>=1)
			return n*factRecurse(n-1);
		else
			return 1;
	}
	
	static int powerRecursion(int X,int N) {
		if(N != 0)
			return X*powerRecursion(X,N-1);
		else
			return 1;
	}
	
	static int fibRecursion(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return fibRecursion(n-1)+fibRecursion(n-2);
	}
	
	static int gcdRecursion(int a,int b) {
		if(b!=0)
			return gcdRecursion(b,a%b);
		else 
			return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice, count;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1. Determine the factorial of a number");
			System.out.println("2. Determine X to the power N ");
			System.out.println("3. Determine GCD of two number.");
			System.out.println("4. Binary equivalent of a decimal number");
			System.out.println("5. Product of two numbers");
			System.out.println("6. Fibonaci Series");
			System.out.println("-----------------------------------------");
			System.out.println("\nEnter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("To find Factorial using recursion:");
				System.out.println("Enter a number to find factorial");
				int factNum=sc.nextInt();
				System.out.println("Factorial of "+factNum+" is: "+factRecurse(factNum));
				System.out.println("-----------------------------------------");
				break;
			case 2:
				System.out.print("To find X to the power N using recursion:");
				System.out.print("Enter value of X :");
				int X=sc.nextInt();
				System.out.print("Enter value of N:");
				int N=sc.nextInt();
				System.out.println(X+" to the power "+N+" is: "+powerRecursion(X,N));
				break;
			case 3:
				System.out.print("To find GCD using recursion:");
				System.out.print("Enter 1st number:");
				int a=sc.nextInt();
				System.out.print("Enter 2nd number:");
				int b=sc.nextInt();
				System.out.println("GCD of "+a+" and "+b+" is: "+gcdRecursion(a,b));
				break;
			case 6:
				System.out.print("To find Fibonacci number using recursion:");
				System.out.println("How many fibonacci Number:");
				count=sc.nextInt();
				for(int i=0;i<count;i++) {
					System.out.print(fibRecursion(i)+" ");
				}
				System.out.println();
				System.out.println("-----------------------------------------");
				break;
			default:
				System.out.println("Program Exit Thank You");
				System.exit(0);
			}
		}while(choice<7);

	}

}
