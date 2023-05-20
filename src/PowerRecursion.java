import java.util.Scanner;
public class PowerRecursion {
	static int powerRecursion(int base,int p) {
		if(p != 0)
			return (base*powerRecursion(base,p-1));
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base number:");
		int base=sc.nextInt();
		System.out.print("Enter value of power:");
		int p=sc.nextInt();
		System.out.println(base+" to the power "+p+" is: "+powerRecursion(base,p));
	}
}
