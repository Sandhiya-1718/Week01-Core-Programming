import java.util.Scanner;
import java.lang.Math;
public class Armstrong{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int originalNumber=n,sum=0,digits=0,temp=n;
		while(temp>0)
		{
			digits++;
			temp/=10;
		}
		while(n>0)
		{
			sum+=Math.pow(n%10,digits);
			n/=10;
		}
		if(sum==originalNumber)
			System.out.print("Its an Armstrong Number");
		else
			System.out.print("It is not an Armstrong Number");
	}
}