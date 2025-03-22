import java.util.Scanner;
public class NumberFormat
{
	public static void generateException(String s)
	{
			System.out.println(Integer.parseInt(s));
	}
	public static void handleException(String s)
	{
		try
		{
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Numbers not found in the string.");
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		handleException(s);
		generateException(s);
	}
}