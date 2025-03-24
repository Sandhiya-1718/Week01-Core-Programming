import java.util.Scanner;
public class Factorial{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
	}
	public static long calculateFactorial(int n)
	{
		if(n==0||n==1)
			return 1;
		return n*calculateFactorial(n-1);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num=getInput(scanner,"Enter a number to find it's factorial:");
		if(num<0)
			System.out.println("Factorial cannot be defined");
		else
		{
			long factorial=calculateFactorial(num);
			System.out.println("Factorial of "+num+" is:"+factorial);
		}
		scanner.close();
	}
}