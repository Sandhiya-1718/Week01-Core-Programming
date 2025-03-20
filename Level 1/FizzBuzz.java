import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(n<=0)
		{
			System.out.print("Please enter a positive number");
			return;
		}
		String array[]=new String[n];
		for(int i=0;i<n;i++)
		{
			if(i%5==0&&i%3==0)
				array[i]="FizzBuzz";
			else if(i%3==0)
				array[i]="Fizz";
			else if(i%5==0)
				array[i]="Buzz";
			else
				array[i]=String.valueOf(i);
		}
		for(int i=0;i<n;i++)
			System.out.println("Position "+(i+1)+" = "+array[i]);
	}
}