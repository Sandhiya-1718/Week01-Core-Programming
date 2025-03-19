import java.util.Scanner;
public class CountNumbers{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int digits=0,temp=n;
		while(temp>0)
		{
			digits++;
			temp/=10;
		}
		System.out.print("The count of the number of digits:"+digits);
	}
}