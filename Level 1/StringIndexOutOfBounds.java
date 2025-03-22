import java.util.Scanner;
public class StringIndexOutOfBounds{
	public static void generateException(String s,int i)
	{
			System.out.println(s.charAt(i));
	}
	public static void handleException(String s,int i)
	{
		try
		{
			System.out.println(s.charAt(i));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Index number exceed the size of the string.");
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		System.out.print("Enter the index number:");
		int index=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		handleException(s,index);
		generateException(s,index);
	}
}
		