import java.util.Scanner;
public class QuotientRemainder{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number:");
		double num1=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter second number:");
		double num2=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.print("The Quotient is "+num1/num2+" and Remainder is "+num1%num2+" of two numbers "+num1+" and "+num2);
	}
}
		