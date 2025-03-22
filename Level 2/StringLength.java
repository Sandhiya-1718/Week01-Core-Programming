import java.util.Scanner;
public class StringLength{
	public static int findLengthOfString(String s)
	{
		int count=0;
		try
		{
			while(true)
			{
				s.charAt(count);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return count;
		}	
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		int count=findLengthOfString(s);
		System.out.print("Number of characters in the strings:"+count);
	}
}
		