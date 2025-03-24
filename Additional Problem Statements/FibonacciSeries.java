import java.util.Scanner;
public class FibonacciSeries{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
	}
	public static void generateFibonacciSeries(int n)
	{
		System.out.print("Fibonacci Series:");
		int first=-1,second=1,next;
		for(int i=0;i<=n;i++)
		{
			next=second+first;
			System.out.print(next+" ");
			first=second;
			second=next;
		}	
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num=getInput(scanner,"Enter the no.of Fibonacci series to be generated:");
		scanner.close();
		if(num<=0)
			System.out.println("Please enter a positive integer.!!");
		else
			generateFibonacciSeries(num);
	}
}