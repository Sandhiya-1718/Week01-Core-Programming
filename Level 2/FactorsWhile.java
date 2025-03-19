import java.util.Scanner;
public class FactorsWhile{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Factors of "+n+":");
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
				System.out.println(i);
			i++;
		}
	}
}