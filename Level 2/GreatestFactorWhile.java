import java.util.Scanner;
public class GreatestFactorWhile{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int greatestFactor=1;
		int i=n-1;
		while(i>1)
		{
			if(n%i==0)
			{
				greatestFactor=i;
				break;
			}
			i--;
		}
		System.out.print("Greatest Factor:"+greatestFactor);
	}
}