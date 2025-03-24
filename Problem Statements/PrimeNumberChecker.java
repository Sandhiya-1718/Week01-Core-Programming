import java.util.Scanner;
public class PrimeNumberChecker{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
	}
	public static boolean checkPrime(int a)
	{
		if(a<2)
			return false;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int a=getInput(scanner,"Enter a number:");
		boolean isPrime=checkPrime(a);
		System.out.print(isPrime?"The number is a prime number":"The number is not a prime number");
	}
}