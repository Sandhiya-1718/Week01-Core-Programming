import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the radius:");
		double radius=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double area=3.14*radius*radius;
		System.out.print("Area of Circle of radius "+radius+" is "+area);
	}
}