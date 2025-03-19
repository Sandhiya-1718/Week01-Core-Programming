import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		boolean isPrime=true;
		if(n<=1)
			isPrime=false;
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
			System.out.print("It is a prime number");
		else
			System.out.print("It is not a prime number");
	}
}