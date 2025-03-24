import java.util.Scanner;
public class TemperatureConverter{
	public static double getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextDouble();
	}
	private static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
	private static double celsiusToFahrenheit(double celsius)
	{
		return (celsius*9/5)+32;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 1 to convert fahrenheit to celsius");
		System.out.println("Press 2 to convert celsius to fahrenheit");
		System.out.print("Choose an option(1 or 2):");
		int choice=scanner.nextInt();
		double fahrenheit,celsius;
		switch(choice)
		{
		case 1:
			fahrenheit=getInput(scanner,"Enter temperature in fahrenheit:");
			celsius=fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"ºF is equal to "+celsius+"ºC.");
			break;
		case 2:
			celsius=getInput(scanner,"Enter temperature in celsius:");
			fahrenheit=celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equal to "+fahrenheit+"°F.");
			break;
		default:
			System.out.println("Invalid choice!Please enter 1 or 2.");
		}
		scanner.close();
	}
}
