package OOP1;

public class Employee_Encap {
	public static void main(String[] args) {
		String str="lev",rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("string is a palindrome:"+str);
		}
		
		else {
			System.out.println("string is not a palindrome");
		}
				
	}

}
