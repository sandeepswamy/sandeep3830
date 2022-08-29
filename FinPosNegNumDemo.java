package riddhi;

import java.util.Scanner;

public class FinPosNegNumDemo {
public static void main(String[] args) {
	double num;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	num=scanner.nextDouble();
	if(num>=0.0)
	{
		System.out.println("number is:positive");
	}
		else if (num<=0.0) 
	{
		System.out.println("number is :negative");
	}
}

}
