import java.util.Scanner;
public class FactorialFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.print("Factorial:"+fact);
	}
}