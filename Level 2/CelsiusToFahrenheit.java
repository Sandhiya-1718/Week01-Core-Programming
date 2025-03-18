import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter temperature in celsius:");
		double celsius=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double fahrenheitResult=(celsius*9/5)+32;
		System.out.print("The "+celsius+" celsius is "+fahrenheitResult+" fahrenheit");
	}
}