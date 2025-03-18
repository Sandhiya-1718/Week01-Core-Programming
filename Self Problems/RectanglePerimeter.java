import java.util.Scanner;
public class RectanglePerimeter{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter length of rectangle:");
		double length=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter width of rectangle:");
		double width=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double perimeter=2*(length+width);
		System.out.print("The perimeter of rectangle with length "+length+" and width "+width+" is "+perimeter);
	}
}