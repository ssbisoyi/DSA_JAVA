import java.util.Scanner;
public class GenericArraySearch {
	<T> void searchElement(T arr[], T item) {
		int count=0;
		for(T x:arr) {
			if(x==item)
				count++;
		}
		System.out.println("Number of times "+item+" present in the array is "+count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GenericArraySearch ob=new GenericArraySearch();
		Integer intArr[]=new Integer[5];
		System.out.println("Enter 5 elements into the array");
		for(int i=0;i<5;i++) {
			intArr[i]=sc.nextInt();
		}
		ob.searchElement(intArr,2);
	}
}
