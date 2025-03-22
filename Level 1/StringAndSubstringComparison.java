import java.util.Scanner;
public class StringAndSubstringComparison{
	public static String generateSubstringUsingCharAt(String s,int start,int end)
	{
		StringBuilder subString = new StringBuilder();
        for(int i=start;i<end;i++)
            subString.append(s.charAt(i));
        return subString.toString();
	}
	public static boolean compareUsingCharAt(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
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
		String str=scanner.nextLine();
		System.out.print("Enter the start of the substring:");
		int start=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the end of the substring:");
		int end=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		String charAtSubstring=generateSubstringUsingCharAt(str,start,end);
		System.out.println("Substring using charAt:"+charAtSubstring);
		String inBuildSubstring=str.substring(start,end);
		System.out.println("Substring using in-build method:"+inBuildSubstring);
		boolean comparison=compareUsingCharAt(charAtSubstring,inBuildSubstring);
		System.out.print(comparison?"Both are same":"Both are not same");
	}
}	