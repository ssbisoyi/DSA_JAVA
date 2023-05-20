import java.util.Scanner;
class MarkOutOfBoundException extends Throwable{
	MarkOutOfBoundException(String msg){
		super(msg);
	}
}
public class UDFException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Student:");
		String name=sc.nextLine();
		System.out.println("Enter the mark of the student:");
		int mark=sc.nextInt();
		System.out.println("Name of the Student is: "+name);
		try {
			if(mark>100)
				throw new MarkOutOfBoundException(" Mark can't be greater than 100");
			else
				System.out.println("Mark f the Student is: "+mark);
		}
		catch(MarkOutOfBoundException ob) {
			System.out.println(ob);
		}
	}

}
