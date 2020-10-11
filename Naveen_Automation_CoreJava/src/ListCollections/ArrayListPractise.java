package ListCollections;

import java.util.ArrayList;

public class ArrayListPractise {
	
	public static void main(String[] args) {
		
		//creating objects of employee class 
		//Employee1 e1=new Employee1("rish", 26, "tcs");
		//Employee1 e2=new Employee1("sakshi", 29, "infosys");
		//Employee1 e3=new Employee1("amit", 27, "billenium");
		
		//ArrayList<Employee1> arl= new ArrayList<Employee1>();
	//	arl.add(e1);
		//arl.add(e2);
		//arl.add(e3);
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(10);
		ar2.add(20);
		ar2.add(30);
		ar2.ad
		
		System.out.println(ar2.size());
		
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
	
		ar2.remove(10);
		ar2.remove(20);
		
		System.out.println(ar2.size());
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
		//after adding the element if you have to change the value it can be done through set method
		ArrayList<String> al = new ArrayList<>(); 
		  
        al.add("Geeks"); 
        al.add("Geeks"); 
        al.add(1, "Geeks"); 
  
        System.out.println("Initial ArrayList " + al); 
  
        al.set(1, "For"); 
  
        System.out.println("Updated ArrayList " + al); 
    } 
		
		
		
	}

}
