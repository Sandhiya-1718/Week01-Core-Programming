import java.util.Scanner;
public class GcdAndLcm{
	public static int getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextInt();
	}
	public static int calculateGcd(int a,int b)
	{
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static int calculateLcm(int a,int b,int gcd)
	{
		return (a*b)/gcd;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int num1=getInput(scanner,"Enter the first number:");
		int num2=getInput(scanner,"Enter the second number:");
		int gcd=calculateGcd(num1,num2);
		int lcm=calculateLcm(num1,num2,gcd);
		System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		scanner.close();
	}
}