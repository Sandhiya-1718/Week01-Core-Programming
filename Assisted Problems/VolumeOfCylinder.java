import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the radius:");
		double radius=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the height:");
		double height=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double volume=3.14*radius*radius*height;
		System.out.print("The volume of Cylinder with radius "+radius+" and height "+height+" is "+volume);
	}
}