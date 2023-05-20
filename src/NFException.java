import java.util.Scanner;
public class NFException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your lucky number ");
		int n=sc.nextInt();
		try {
		if(n<0)
			throw new NumberFormatException("Negative number");
		else
			System.out.println("Your lucky number is "+n);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Out of try and catch");		
	}
}
