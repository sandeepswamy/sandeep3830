package riddhi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class ArrayListDemo {
public static void main(String[] args) {
	
	String[] str = {"vanshi","supriya","sandeep","swamy","daughter"};
	for(int i=0; i<str.length; i++)
	{
	System.out.println(str[i]);	
	}
	System.out.println("******");
	
	for(String str1  :str)
	{
		if(str1.equalsIgnoreCase("supriya")) {
			System.out.println("vanshi");
		}
	System.out.println(str1);	
	}
	
	
	//List list = new ArrayList<>();
	//ArrayList list = new ArrayList<>();
//	
//	LinkedList list = new LinkedList<>();
//	
//	list.add(456);
//	list.add(4);
//	list.add(256);
//	list.add(0, 4);
//	list.add(1);
//	list.add("java");
//	list.add("job");
//	list.addAll(list);
//	list.addFirst("job");
//	System.out.println(list);
	
//	Stack stack =new Stack<>();
////	HashSet list = new HashSet();
//	list.add(456);
//	list.add(4);
//	list.add(456456);
//	list.add(1);
//	list.add(456);
//	list.add(4);
	
	/*
	 * // ListIterator listIterator = list.listIterator(); //
	 * while(listIterator.hasNext()); // Object obj = listIterator.next(); //
	 * Integer i=(Integer) obj; // if(i==456) { // System.out.println("sandy"); // }
	 * // System.out.println(i); //
	 */	
	
//	Iterator itr= list.iterator();
//	while(itr.hasNext()) {
//		Object obj=itr.next();
//		Integer i = (Integer) obj;
//		if(i==4) {
//			System.out.println("hello");
//		}
//		System.out.println(i);
//	}
//	
//	
	/*
	 * List list =new ArrayList<>(); list.add("java"); list.add("job");
	 * list.add("hi"); list.add("how");
	 * 
	 * for(Object obj: list) { String str =(String) obj;
	 * if(str.equalsIgnoreCase("hi")) { System.out.println("im good"); }
	 * System.out.println(str); }
	 */
	
	
	/*
	 * Iterator itr1 = list.iterator(); while(itr1.hasNext()) { Object obj=
	 * itr1.next(); String str =(String) obj; if(str.equalsIgnoreCase("hi")) {
	 * System.out.println("im good");
	 * 
	 * } System.out.println(str); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Enumeration enumeration =stack.elements();
//	while(enumeration.hasMoreElements())
//	{
//		Object obj = enumeration.nextElement();
//		Integer i = (Integer) obj;
//		if(i==456456) {
//			System.out.println("hi");
//		}
//		System.out.println(obj);
//	}
//	
//	System.out.println(stack);
	
//	Object obj = list.get(5);
//	System.out.println(obj);
//	
//	
	
	
	
	
	
}
}
