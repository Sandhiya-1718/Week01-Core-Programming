import java.util.Scanner;
public class MultiplesFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.println("The multiples of "+n+" are:");
		if(n>1&&n<100)
		{
			for(int i=100;i>0;i--)
			{
				if(n%i==0)
					System.out.println(i);
			}
		}
	}
}