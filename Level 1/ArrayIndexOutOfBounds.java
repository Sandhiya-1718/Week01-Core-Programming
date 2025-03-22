import java.util.Scanner;
public class ArrayIndexOutOfBounds
{
	public static void generateException(String s[],int i)
	{
		System.out.println(s[i]);
	}
	public static void handleException(String s[],int i)
	{
		try
		{
			System.out.println(s[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException found");
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of elements:");
		int n=scanner.nextInt();
		scanner.nextLine();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter string "+(i+1)+":");
			s[i]=scanner.nextLine();
		}
		System.out.print("Enter the element to display:");
		int i=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		handleException(s,i);
		generateException(s,i);
	}
}