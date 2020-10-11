package ListCollections;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListCollections {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		
		//add elements to linkedlist
		ll.add("test");
		ll.add("java");
		ll.add("selenium");
		
		System.out.println(ll.size());
		
		//add element at first
		ll.addFirst("testNG");
		System.out.println(ll);
		
		//add element in last
		ll.addLast("cucumber");
		System.out.println(ll);

		//get indexth element and set indexxt
		ll.get(0);
		System.out.println(ll.get(0));
		ll.set(0, "jenkins");
		System.out.println(ll);
		
		//remove indexth element
		ll.remove(0);
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.add("test");
		ll.add("class");
		System.out.println(ll);
		
		//howto print values of linked list
		//1.for loop. 2.for each loop 3.iterator 4.while loop
		System.out.println("using forloop************");
		for(int i=0;i<ll.size();i++) {
			
			System.out.println(ll.get(i));
		}
		System.out.println("using advanced forloop************");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println("using iterator **********");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {//if in this iterator next element is available print it
			
			System.out.println(it.next());
		}
		
		System.out.println("using whileloop **********");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
