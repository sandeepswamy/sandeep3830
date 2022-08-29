package riddhi;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	Vector vector=new Vector<>();
	vector.add(456);
	vector.add(0, "java");
	vector.addElement(45.456);
	vector.add(null);
	vector.add(456);
	vector.add(null);
	vector.add(456);
	System.out.println(vector);
	
	Stack stack = new Stack<>();
	stack.add(456);
	stack.add(0, 91456);
	stack.addElement("java");
	stack.push("job");
	stack.add(456);
System.out.println(stack);

}
}
