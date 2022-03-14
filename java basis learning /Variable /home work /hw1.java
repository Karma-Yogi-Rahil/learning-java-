import java.util.*;
import javax.swing.plaf.basic.*;

class Untitled {
	public static void main(String[] args) {
		// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
		
		Scanner imput = new Scanner(System.in);
		float radius = imput.nextFloat();
		//float pi = 3.14f;
		float area = 3.14f * (radius*radius);
		
		System.out.println(area+" cm^2 is the area of circle whose radius is "+radius+"cm");
		
	}
}