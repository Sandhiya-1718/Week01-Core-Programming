import java.util.Scanner;
public class UserZeroBreak{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number or 0 to stop:");
		double n=scanner.nextDouble();
		scanner.nextLine();
		double total=0.0;
		while(true)
		{
			total+=n;
			System.out.print("Enter a number or 0 to stop:");
			n=scanner.nextDouble();
			scanner.nextLine();
			if(n<=0)
				break;
		}
		System.out.print("Total:"+total);
	}
}