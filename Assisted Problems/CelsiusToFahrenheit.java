import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the the temperature in Celsius:");
		double celsius=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double fahrenheit=(celsius*9/5)+32;
		System.out.print(celsius+" celsius is converted as "+fahrenheit+" fahrenheit");
	}
}