import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner  scanner=new Scanner(System.in);
		System.out.print("Enter the no.of elements:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(n<=0)
		{
			System.err.print("Please enter a natural number");
			System.exit(0);
		}
		int oddArr[]=new int[n/2+1];
		int evenArr[]=new int[n/2];
		int odd=0,even=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evenArr[even]=i;
				even++;
			}
			else
			{
				oddArr[odd]=i;
				odd++;
			}
		}
		System.out.print("Odd numbers:");
		for(int i=0;i<odd;i++)
			System.out.print(oddArr[i]+" ");
		System.out.println();
		System.out.print("Even numbers:");
		for(int i=0;i<even;i++)
			System.out.print(evenArr[i]+" ");
		
	}
}