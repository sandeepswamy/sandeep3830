package riddhi;

import java.util.Comparator;
import java.util.TreeSet;

class CustomSortingOne implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String str= (String) o1;
		String str1=(String) o2;
		System.out.println("***********");
		//return str.compareTo(str1);
		//return -str.compareTo(str1);
		//return str1.compareTo(str);
		return -str1.compareTo(str);
	}
	
}

public class CustomSortingTest {
public static void main(String[] args) {
	CustomSortingOne customSortingOne= new CustomSortingOne();
	TreeSet set=new TreeSet<>(customSortingOne);
	set.add("java");
	set.add("selenium");
	set.add("hardwork");
	set.add("job");
	set.add("happy");
	set.add("happy");
	System.out.println(set);
	
}
}


