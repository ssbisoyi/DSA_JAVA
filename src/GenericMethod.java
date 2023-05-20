
public class GenericMethod {
	public static <T> void printData(T x){
		System.out.println(x);
	}
	public <T> void printElement(T arr[]) {
		for(T x:arr)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		GenericMethod ob=new GenericMethod();
		Integer a=new Integer(10);
		printData(a);
		Integer arr[]= {10,20,30};
		String str[]= {"Ram","Shyam","Gopal"};
		Character chArr[]= {'A','B','C','D'};
		ob.printElement(str);
		ob.printElement(chArr);
		ob.printElement(arr);
	}

}
