import java.util.Scanner;
public class UnitConvertor2{
	public static double convertYardsToFeet(double yards)
	{
		return yards*3;
	}
	public static double convertFeetToYards(double feet)
	{
		return feet*0.33333 ;
	}
	public static double convertMetersToInches(double meters)
	{
		return meters*39.3701;
	}
	public static double convertInchesToMeters(double inches)
	{
		return inches*0.0254;
	}
	public static double convertInchesToCm(double inches)
	{
		return inches*2.54;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter yards:");
		double yards=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter feet:");
		double feet=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter meters:");
		double meters=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter inches:");
		double inches=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.println(yards+" yards= "+convertYardsToFeet(yards)+" feet");
		System.out.println(feet+" feet="+convertFeetToYards(feet)+" yards");
		System.out.println(meters+" meters="+convertMetersToInches(meters)+" inches");
		System.out.println(inches+" inches="+convertInchesToMeters(inches)+" meters");
		System.out.println(inches+" inches="+convertInchesToCm(inches)+" cm");
	}
}