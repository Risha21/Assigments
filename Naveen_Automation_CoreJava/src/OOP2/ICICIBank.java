package OOP2;

public class ICICIBank implements USBank {
	

	@Override
	public void debit() {
		System.out.println("us bank debit");
		
	}

	@Override
	public void credit() {
		System.out.println("us bank credit");
		
	}

	@Override
	public void transfermoney() {
		System.out.println("us bank transfer");
		
	}

	public void trading() {
		System.out.println("method belongs to class");
	}
	



}

