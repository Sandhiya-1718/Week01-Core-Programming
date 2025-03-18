import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number:");
		double num1=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter second number:");
		double num2=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter third number:");
		double num3=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.print("The average of "+num1+","+num2+","+num3+" is "+(num1+num2+num3)/3);
	}
}