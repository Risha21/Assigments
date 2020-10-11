package OOP2;

public class TestBank {

	public static void main(String[] args) {
		ICICIBank ic=new ICICIBank();
		ic.credit();
		ic.debit();
		ic.trading();
		ic.transfermoney();
		
		USBank us=new ICICIBank();
		us.credit();
		us.debit();
		us.transfermoney();
		//us.trading not accessible with reference of interface you cannot access class
		
		WebDriver d

	}

}
