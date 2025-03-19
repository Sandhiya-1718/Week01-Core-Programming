import java.util.Scanner;
public class PositiveNegative{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(n>0)
			System.out.print("Positive");
		else if(n<0)
			System.out.print("Negative");
		else
			System.out.print("Zero");
	}
}