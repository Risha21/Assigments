
public class Palindrome {
	
	public static void main(String[] args) {
		 String original="level";
		 String reverse="";
		 System.out.println(original.length());
		 int len=original.length();
		 for(int i=len-1;i>=0;i--) {
			 reverse=reverse+ original.charAt(i);		
			 
		 }
		 System.out.println(reverse);
	
	
	
	if(original.equals(reverse)) {
		System.out.println("String is a palindrome");
	}
	
	else
		System.out.println("String is not a palindrome");

}
	
}