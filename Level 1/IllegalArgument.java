import java.util.Scanner;
public class IllegalArgument
{
	public static void generateException(String s,int start,int end)
	{
			System.out.println(s.substring(start,end));
	}
	public static void handleException(String s,int start,int end)
	{
		try
		{
			System.out.println(s.substring(start,end));
		}
		catch(Exception e)
		{
			System.out.println("Start index is greater than end index.");
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		System.out.print("Enter the substring start index number:");
		int start=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the substring end index number:");
		int end=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		handleException(s,start,end);
		generateException(s,start,end);
	}
}