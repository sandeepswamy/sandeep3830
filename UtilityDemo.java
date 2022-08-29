package riddhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UtilityDemo {
public static void main(String[] args) {

List list = new ArrayList<>();
list.add(456);
list.add(1);
list.add(6589);
list.add(789);
list.add(5);
System.out.println(list);

Set<String> set = new HashSet<>();
set.add("hello");
set.add("job");
set.add("name");
System.out.println(set);

Iterator<String> itr = set.iterator();
while(itr.hasNext()) {
	String str= itr.next();
	if(str.equalsIgnoreCase("name"))
		{
			System.out.println("luck");
		}
	System.out.println(str);
}

//
//for(String str:set)
//{
//	if(str.equalsIgnoreCase("job"))
//	{
//		System.out.println("work hard");
//	}
//System.out.println(str);








//for(Object obj:list)
//{
//Integer i= (Integer) obj;
//if(i==6589) {
//System.out.println("job");
//}
//System.out.println(i);
		
//TreeSet set = new TreeSet<>();
//set.add(456);
//set.add(1);
//set.add(6589);
//set.add(789);
//System.out.println(set);

//Collections.sort(list);
//System.out.println(list);
	
	
	
	
//	String[] str= {"java","job","selenium", "demo"};
//	
//	for(String str2: str)
//	{
//		System.out.println(str2);
//	}
//	System.out.println("********");
//	
//	Arrays.sort(str);
//	for(String str2: str)
//	{
//		System.out.println (str2);
//	}
//	System.out.println(Arrays.binarySearch(str, "sandy"));
	
}
}

