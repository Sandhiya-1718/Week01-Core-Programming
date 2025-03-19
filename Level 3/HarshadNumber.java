import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int sum=0,temp=n;
		while(temp>0)
		{
			sum+=(temp%10);
			temp/=10;
		}
		if(n%sum==0)
			System.out.print("It is a Harshad Number");
		else
			System.out.print("It is not a Harshad Number");
	}
}