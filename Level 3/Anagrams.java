import java.util.Scanner;
public class Anagrams{
	public static boolean areAnagrams(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		int frequency1[]=new int[256];
		int frequency2[]=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			frequency1[s1.charAt(i)]++;
			frequency2[s2.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(frequency1[i]!=frequency2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1=scanner.nextLine();
		System.out.print("Enter second string:");
		String s2=scanner.nextLine();
		scanner.close();
		System.out.print(areAnagrams(s1,s2)?"Two strings are anagrams":"Two strings are not anagrams");
	}
}