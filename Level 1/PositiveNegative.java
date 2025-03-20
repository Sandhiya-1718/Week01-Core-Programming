import java.util.Scanner;
public class PositiveNegative{
	public static void main(String[] args){
		Scanner  scanner=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<n.length;i++)
		{
			System.out.print("Enter number "+(i+1)+":");
			n[i]=scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>0)
			{
				if(n[i]%2==0)
					System.out.println(n[i]+" is a Even number");
				else
					System.out.println(n[i]+" is a Odd number");
			}
			else if(n[i]<0)
				System.out.println(n[i]+" is a Negative number");
			else
				System.out.println(n[i]+" is Zero");
		}
		if(n[0]<n[4])
			System.out.print("First element is lesser than last element");
		else if(n[0]>n[4])
			System.out.print("First element is greater than last element");
		else
			System.out.print("First and last element are equal");
	}
}
			