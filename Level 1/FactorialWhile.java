import java.util.Scanner;
public class FactorialWhile{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int fact=1;
		while(n>0)
		{
			fact*=n;
			n--;
		}
		System.out.print("Factorial:"+fact);
	}
}