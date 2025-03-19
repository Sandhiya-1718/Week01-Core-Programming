import java.util.Scanner;
public class UserZero{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number or 0 to stop:");
		double n=scanner.nextDouble();
		scanner.nextLine();
		double total=0.0;
		while(n!=0)
		{
			total+=n;
			System.out.print("Enter a number or 0 to stop:");
			n=scanner.nextDouble();
			scanner.nextLine();
		}
		System.out.print("Total:"+total);
	}
}