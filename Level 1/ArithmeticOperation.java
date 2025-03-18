import java.util.Scanner;
public class ArithmeticOperation{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number 1:");
		float number1=scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Enter number 2:");
		float number2=scanner.nextFloat();
		scanner.nextLine();
		scanner.close();
		float addition=number1+number2;
		float subtraction=number1-number2;
		float multiplication=number1*number2;
		float division=number1/number2;
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+","+subtraction+","+multiplication+","+division);
	}
}