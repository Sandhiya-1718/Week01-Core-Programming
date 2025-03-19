import java.util.Scanner;
public class CountdownFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		for(int i=n;i>0;i--)
		{
			System.out.println(n);
			n--;
		}
	}
}