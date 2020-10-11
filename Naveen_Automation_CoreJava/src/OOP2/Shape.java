package OOP2;

public abstract class Shape {
	Shape(){
		System.out.println("Shape class constructor");
		
	}
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("this is parent class");
	}
	//cannot create the object of interface

}
