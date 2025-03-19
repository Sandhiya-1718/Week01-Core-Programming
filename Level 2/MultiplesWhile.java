import java.util.Scanner;
public class MultiplesWhile{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.println("The multiples of "+n+" are:");
		if(n>1&&n<100)
		{
			int i=n-1;
			while(i>0)
			{
				if(n%i==0)
					System.out.println(i);
				i--;
			}
		}
	}
}