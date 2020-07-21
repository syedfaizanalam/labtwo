import java.util.Scanner;

public class Lab2 {
	
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	double length;
	double width;
	double perimeter;
	double area;

	System.out.println("Please enter the length of the classrom.");
	length = scnr.nextDouble();
	System.out.println("Please enter the width of the classroom.");
	width = scnr.nextDouble();

	perimeter = (length * 2) + (width * 2);
	area = length * width;
	System.out.println("Classroom's perimeter is " + perimeter + ".");
	System.out.println("Classroom's area is " + area + ".");
	
	double height;
	double volume;
	String decision;
	
	System.out.println("Would you like to calculate the volume?");
	System.out.println("Please enter 'yes' or 'no'");
	decision = scnr.next();
	if (decision.equals("yes")) {
		System.out.println("What is the height of the classroom?");
		height = scnr.nextDouble();
		
		volume = height * width * height;
		System.out.println("The volume of the classroom is " + volume + ".");
		
	} else if (decision.equals("no")) {
		System.out.println("Suit yourself.");
	} else {
		System.out.println("Entry invalid. Try again.");
	}
}
}
