import java.util.Scanner;
public class SimpleInterest{
	public static double si(double principal,double rate,int time)
	{
		double si=principal*rate*time/100;
		return si;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the principal amount:");
		double p=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the rate of interest:");
		double r=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the Time period:");
		int t=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("The simple interest is "+si(p,r,t));
	}
}