
public class Test_Interview {

	public static void main(String[] args) {
		Interview parent=new Interview();
		parent.display();
		
		B child=new B();
		child.display();
		child.newmethod();
		
		Interview p=new B();
		p.display();
		

	}

}
