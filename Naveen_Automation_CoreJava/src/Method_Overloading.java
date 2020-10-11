
public class Method_Overloading {
	
	public static void main(String args[]) {
		Method_Overloading object = new Method_Overloading();
		object.Bank(12.5,13.6);
		object.Bank(15);
	}
	
	public void Bank(int x) {
		
		System.out.println("hi ,i have 1 argument");
		System.out.println(x);
		
	}
	
	public void Bank(Double x, Double y) {
		System.out.println("method is with 0 argument ");
		System.out.println(+x+ "" +y+"hi");
		
		
	}

}
