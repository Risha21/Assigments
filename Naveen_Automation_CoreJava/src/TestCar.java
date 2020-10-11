
public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();// same method is in parent as well as child preference is given to method of
					// child class//method overriding
		b.stop();// same method is in parent as well as child preference is given to method of
					// child class
		b.theftSafety();// method of child class
		b.refuel();// method of parent

		System.out.println("*************************");

		Car c = new Car();

		c.start();// parent class syso will be printed and only parent class methods are
					// accessible
		c.stop();
		c.refuel();

		System.out.println("*************************");

		Car parent = new BMW();//child class object can be referred by parent class reference variable-dynamic polymor..
		parent.refuel();
		parent.start();// child class method being called
		parent.stop();
		// child class methods which are not available in parent are not accessible through parent  reference
		

	}

}
