import java.util.Scanner;
public class Countdown{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}
}