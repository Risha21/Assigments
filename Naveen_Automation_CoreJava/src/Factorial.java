import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	/*	Scanner in=new Scanner(System.in);
		int n, factorial=1;
		
		System.out.println("enter the number whose factorial needs to be calculated:");
		n=in.nextInt();
		while(n>0) {
			factorial=factorial*n;
			n--;
		}
		System.out.println(factorial);

	}*/
		int n=5,factorial=1;
		for(int i=n;i>=1;i--)
		{
			factorial=factorial*i;
			
		}
	
		System.out.println(factorial);
}

}