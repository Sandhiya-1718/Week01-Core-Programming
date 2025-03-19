import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum>n)
			System.out.print("It is Abundant Number");
		else
			System.out.print("It is not Abundant Number");
	}
}