import java.util.Scanner;

public class Circle extends Shape {

	@Override
	public void calArea() {
	  float radius;
	  System.out.println("Enter radius of circle");
	  Scanner sc=new Scanner(System.in);
	  radius=sc.nextFloat();
	  area=pi*radius*radius;
	  System.out.println("Area of circle is: "+area);
		
	}

}
