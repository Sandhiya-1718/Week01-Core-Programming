import java.util.Scanner;
import java.lang.Math;
public class Factor{
	public static int[] findFactors(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		int factors[]=new int[count];
		int index=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				factors[index]=i;
				index++;
			}
		}
		return factors;
	}
	public static int sumOfFactors(int[] factors)
	{
		int sum=0;
		for(int i=0;i<factors.length;i++)
			sum+=factors[i];
		return sum;
	}
	public static int sumOfSquareOfFactors(int[] factors)
	{
		int sumOfSquares=0;
		for(int i=0;i<factors.length;i++)
			sumOfSquares+=Math.pow(factors[i],2);
		return sumOfSquares;
	}
	public static long productOfFactors(int[] factors)
	{
		long product=1;
		for(int i=0;i<factors.length;i++)
			product*=factors[i];
		return product;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int factors[]=findFactors(n);
		System.out.print("Factors:");
		for(int i=0;i<factors.length;i++)
			System.out.print(factors[i]+" ");
		System.out.println();
		System.out.println("Sum of factors:"+sumOfFactors(factors));
		System.out.println("Sum of squares of factors:"+sumOfSquareOfFactors(factors));
		System.out.print("Product of factors:"+productOfFactors(factors));
	}
}