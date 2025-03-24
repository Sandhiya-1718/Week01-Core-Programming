import java.util.Scanner;
public class Calculator{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static void calculate(int a,int b,int choice)
	{
		switch(choice)
		{
		case 1:
			System.out.print("Addition of "+a+" and "+b+" is "+add(a,b));
			break;
		case 2:
			System.out.print("Subtraction of "+a+" and "+b+" is "+sub(a,b));
			break;
		case 3:
			System.out.print("Multiplication of "+a+" and "+b+" is "+mul(a,b));
			break;
		case 4:
			System.out.print("Division of "+a+" and "+b+" is "+div(a,b));
			break;
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num1=getInput(scanner,"Enter first number:");
		int num2=getInput(scanner,"Enter second number:");
		System.out.println();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice=getInput(scanner,"Choose the operation to perform:");
		calculate(num1,num2,choice);
		scanner.close();	
	}
}