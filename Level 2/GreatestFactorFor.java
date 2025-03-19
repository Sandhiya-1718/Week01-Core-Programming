import java.util.Scanner;
public class GreatestFactorFor{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int greatestFactor=1;
		for(int i=n-1;i>1;i--)
		{
			if(n%i==0)
			{
				greatestFactor=i;
				break;
			}
		}
		System.out.print("Greatest Factor:"+greatestFactor);
	}
}