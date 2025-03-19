import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number:");
		int first=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter second number:");
		int second=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the operation to be done:");
		String op=scanner.nextLine();
		scanner.close();
		switch(op)
		{
			case "+":
				System.out.print(first+"+"+second+"="+(first+second));
				break;
			case "-":
				System.out.print(first+"-"+second+"="+(first-second));
				break;
			case "*":
				System.out.print(first+"*"+second+"="+(first*second));
				break;
			case "/":
				if(second != 0) 
					System.out.print(first+"/"+second+"="+(first/second));
				else 
					System.out.print("Division by zero is not allowed.");
				break;
			default:
				System.out.print("Invalid Operator");
		}
		
	}
}