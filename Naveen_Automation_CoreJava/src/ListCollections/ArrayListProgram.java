package ListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	public static void main(String[] args) {
	/*	int a[]=new int[3];//static array size given is 3 but i am entering a[4] hence sys gives array index out of bound
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;*/
		
		//dynamic array----ArrayList
		//1.can contain duplicate value elements
		//2.maintains insertion order
		//3.not synchronised ..not thread safe..
		//4.allows 	random access to fetch element coz it stored value on basis of index
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		ar.add(40);//3
		ar.add(50);//4
		ar.add("test");
		ar.add(12.5);
		
		System.out.println(ar.size());//size of arraylist
		ar.add(60);//5
		ar.add(60);//6
		
		//to print all values from arraylist:
		//1.for loop 2.iterator
	//	for(int i=0;i<ar.size();i++) {
		//	ar.get(i);//get value from an index
			
		//}
		System.out.println(ar.size());
		
	//non generic vs generic
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	arr1.add(100);
	//arr1.add("selenium");//methodin arraylst is not applicable for this type of argument string
	
	ArrayList<String> ar2=new ArrayList<String>();
	ar2.add("risha");
	//ar2.add(100);methodin arraylst is not applicable for this type of argument integer
	
//	ArrayList<E> ar3=new ArrayList<E>();

	//creating objects of employee class
	Employee e1=new Employee("risha", 27,"QA");
	Employee e2=new Employee("Somya", 28,"QA");
	Employee e3=new Employee("soma", 29,"QA");
	
	//create arraylist
	ArrayList<Employee> ar4=new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	//iterator to traverse the values
	Iterator<Employee> it=ar4.iterator();
	while(it.hasNext()) {
		Employee emp=it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	
	
	//***********************************************
//Addall method adds 2 arraylist together
	ArrayList<String> ar5=new ArrayList<String>();
	ar5.add("maggi");
	ar5.add("topraman");
	
	ArrayList<String> ar6=new ArrayList<String>();
	ar6.add("dev");
	ar6.add("java");
	
	ar5.addAll(ar6);
	
	for(int i=0;i<ar5.size();i++) {
		System.out.println(ar5.get(i));
	}
	
	//RemoveAll
	
	ar5.removeAll(ar6);
	for(int i=0;i<ar5.size();i++) {
		System.out.println(ar5.get(i));
	}
	
	//retainall when i want only common thing between 2 arraylist should be printed
	
	ArrayList<String> ar7=new ArrayList<String>();
	ar7.add("test");
	ar7.add("selenium");
	ar7.add("QTP");
	
	ArrayList<String> ar8=new ArrayList<String>();
	ar8.add("test");
	ar8.add("java");
	ar8.add("QTP");
	
	ar7.retainAll(ar8);
	for(int i=0;i<ar7.size();i++) {
		System.out.println(ar7.get(i));
	}
	
	
	
	}

}
