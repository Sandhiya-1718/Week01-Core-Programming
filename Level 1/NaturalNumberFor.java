import java.util.Scanner;
public class NaturalNumberFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int sum1=0;
		if(n>0){
			for(int i=1;i<=n;i++)
				sum1+=i;
			int sum2=n*(n+1)/2;
			if(sum1==sum2)
				System.out.println("Both are equal");
			else
				System.out.println("Both are not equal");
			System.out.print("Sum 1:"+sum1+"\nSum 2:"+sum2);
		}
		else
			System.out.print("The number is not a natural number");
	}
}