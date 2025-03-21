import java.util.Scanner;
public class PositiveNegative{
	public static boolean isPositive(int num)
	{
		return num>0;
	}
	public static boolean isEven(int num)
	{
		return num%2==0;
	}
	public static int compare(int num1,int num2)
	{
		if(num1>num2)
			return 1;
		else if(num1<num2)
			return -1;
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int numbers[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number "+(i+1)+":");
			numbers[i]=scanner.nextInt();
			scanner.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			if(isPositive(numbers[i]))
			{
				if(isEven(numbers[i]))
					System.out.println(numbers[i]+" is a positive and even number");
				else
					System.out.println(numbers[i]+" is a positive and odd number");
			}
			else
				System.out.println(numbers[i]+" is a negative number");
		}
		int result=compare(numbers[0],numbers[4]);
		System.out.print(result==1?"First number is the greater tha last number":result==1?"First number is lesser than last number":"Both numbers are equal");
	}
}