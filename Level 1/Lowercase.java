import java.util.Scanner;
public class Lowercase
{
	public static String lowercaseConversion(String s)
	{
		StringBuilder string=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				string.append((char)((s.charAt(i))+32));
			else
				string.append(s.charAt(i));
		}
		return string.toString();
	}
	public static boolean compareStrings(String s1,String s2)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		String userConversion=lowercaseConversion(s);
		String inbuildConversion=s.toLowerCase();
		System.out.println(compareStrings(userConversion,inbuildConversion)?"Both are same":"Both are different");
	}
}