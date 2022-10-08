package lista5;

import java.util.Scanner;
import lista5.Circle;

public class MainCircle {

	public static void main(String[] args) {
		Circle circle=new Circle();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		float radius=input.nextFloat();
		float area=circle.getarea(radius);
		float circunference=circle.getcircumference(radius);
		System.out.println("area: "+area+" circunference: "+circunference);
		System.out.println("Report the percentage of circle radius increase:");
		double percentage=input.nextDouble();
		radius=circle.getincreaseCircle(percentage,radius);
		area=circle.getarea(radius);
		circunference=circle.getcircumference(radius);
		System.out.println("percentage: "+percentage+" area: "+area+" circunference: "+circunference);
		
		
	}
}
