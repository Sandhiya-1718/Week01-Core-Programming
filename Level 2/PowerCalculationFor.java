import java.util.Scanner;
public class PowerCalculationFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a base number:");
		int base=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter a power:");
		int power=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(power>0)
		{	
			int result=1;
			for(int i=1;i<=power;i++)
				result*=base;
			System.out.print("The base "+base+" raised to the power "+power+" is "+result);
		}
		else
			System.out.print("Please enter a positive number");
	}
}