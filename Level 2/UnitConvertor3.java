import java.util.Scanner;
public class UnitConvertor3{
	public static double convertFahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
	public static double convertCelsiusToFahrenheit(double celsius)
	{
		return (celsius*9/5)+32 ;
	}
	public static double convertPondsToKilograms(double pounds)
	{
		return pounds*3;
	}
	public static double convertKilogramsToPounds(double kilograms)
	{
		return kilograms*2.20462;
	}
	public static double convertGallonsToLiters(double gallons)
	{
		return gallons*3.78541;
	}
	public static double convertLitersToGallons(double liters)
	{
		return liters*0.264172;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter fahrenheit:");
		double fahrenheit=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter celsius:");
		double celsius=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter pounds:");
		double pounds=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter kilograms:");
		double kilograms=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter gallons:");
		double gallons=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter liters:");
		double liters=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.println(fahrenheit+" fahrenheit="+convertFahrenheitToCelsius(fahrenheit)+" celsius");
		System.out.println(celsius+" celsius="+convertCelsiusToFahrenheit(celsius)+" fahrenheit");
		System.out.println(pounds+" pounds="+convertPondsToKilograms(pounds)+" kilograms");
		System.out.println(kilograms+" kilograms="+convertKilogramsToPounds(kilograms)+" pounds");
		System.out.println(gallons+" gallons="+convertGallonsToLiters(gallons)+" liters");
		System.out.println(liters+" liters="+convertLitersToGallons(liters)+" gallons");
	}
}