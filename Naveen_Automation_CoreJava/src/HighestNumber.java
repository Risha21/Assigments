import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in= new Scanner(System.in);
		System.out.println("enter the first number:");
		a=in.nextInt();
		
		
		System.out.println("enter the second number:");
		b=in.nextInt();
		
		
		System.out.println("enter the third number:");
		c=in.nextInt();
		
		if(a<b && a<c) {
			System.out.println("a is the lowest  number:"+a);
			
		}
		
		else if(b<c) {
			System.out.println("b is the lowest number:"+b);
		}
		
		else {
			System.out.println("c is the lowest number:"+c);
		}
		
		
		

	}

}
