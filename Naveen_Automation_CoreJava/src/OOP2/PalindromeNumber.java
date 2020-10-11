package OOP2;

public class PalindromeNumber {
	public static void main(String[] args) {
		
	int num=12345,reversed=0,original,digit;
	original=num;
	
	while(num!=0) {
		 digit=num%10;
		reversed=reversed*10+digit;
		num=num/10;
		
	}

	if(original==reversed) {
		System.out.println("number is a palindrome:" );
	}
	
	else {
		System.out.println("number is not a palindrome");
	}
}
}