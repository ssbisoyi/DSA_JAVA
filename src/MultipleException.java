import java.util.Scanner;
public class MultipleException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 color ");
		String color[]=new String[4];
		for(int i=0;i<4;i++) {
			color[i]=sc.next();
		}
		try {
			System.out.println("Convert string to integer");
			int a=Integer.parseInt("RED");
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Enter ore color");
			color[5]=sc.next();
				//throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("The colours entered are");
		for(String c:color) {
			System.out.println(c);
		}
	}

}
