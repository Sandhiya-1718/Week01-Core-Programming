import java.util.Scanner;
public class SumOfNaturalNumber{
	public static int sumUsingRecursion(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		return sum;
	}
	public static int sumUsingFormula(int n)
	{
		int sum=0;
		sum=n*(n+1)/2;
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		String result=sumUsingRecursion(n)==sumUsingFormula(n)?"Both computations is correct":"Both computations are not correct";
		System.out.print(result);
	}
}