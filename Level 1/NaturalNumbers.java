import java.util.Scanner;
public class NaturalNumbers{
	public static int sumOfNaturalNumbers(int num){
		if(num>=0)
		{
			int sum=num*(num+1)/2;
			return sum;
		}
		else
			return -1;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int sum=sumOfNaturalNumbers(n);
		String res=(sum>=0)?"The sum of natural numbers are "+sum:"Invalid number";
		System.out.print(res);
	}
}