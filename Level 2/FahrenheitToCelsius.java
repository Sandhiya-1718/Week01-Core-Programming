import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit:");
		double fahrenheit=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double CelsiusResult=(fahrenheit-32)*5/9;
		System.out.print("The "+fahrenheit+" fahrenheit is "+CelsiusResult+" celsius");
	}
}