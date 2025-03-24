import java.util.Scanner;
public class MaximumOfThreeNumbers{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
		
	}
	public static int findMax(int a,int b,int c)
	{
		return Math.max(a,Math.max(b,c));
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int a=getInput(scanner,"Enter 1st number:");
		int b=getInput(scanner,"Enter 2nd number:");
		int c=getInput(scanner,"Enter 3rd number:");
		int max=findMax(a,b,c);
		System.out.print("The maximum number is:"+max);
		scanner.close();
	}
}