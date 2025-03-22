import java.util.Scanner;
public class StringComparison2{
	public static char[] getCharacters(String s)
	{
		char charArray[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
			charArray[i]=s.charAt(i);
		return charArray;
	}
	public static boolean compareStrings(char s1[],char s2[])
	{
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=s2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=scanner.nextLine();
		scanner.close();
		char inbuildArray[]=str.toCharArray();
		System.out.print("String split using in build method:");
		for(int i=0;i<inbuildArray.length;i++)
			System.out.print(inbuildArray[i]+" ");
		char userDefinedArray[]=getCharacters(str);
		System.out.print("\nString split using user defined method:");
		for(int i=0;i<userDefinedArray.length;i++)
			System.out.print(userDefinedArray[i]+" ");
		System.out.println("\n"+(compareStrings(inbuildArray,userDefinedArray)?"Both strings are same":"Both strings are different"));
	}
}