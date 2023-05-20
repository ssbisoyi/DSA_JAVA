import java.util.Scanner;
public class RecursiveReverseDigit {
	static void recursiveReverse(int num) {
		if(num<10) {
			System.out.print(num);
			return;
		}
		else {
			System.out.print(num%10);
			recursiveReverse(num/10);
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.print("The reverse of the given number is: ");
		recursiveReverse(num);
	}

}
