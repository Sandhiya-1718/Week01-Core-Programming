import java.util.Scanner;
import java.lang.Math;
public class PowerCalculation{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter base value:");
		double base=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter exponent value:");
		int exponent=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print((Math.pow(base,exponent))+" is the value when base "+base+" raised to the power "+exponent);
	}
}