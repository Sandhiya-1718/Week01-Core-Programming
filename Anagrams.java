import java.util.Scanner;
public class Anagrams{
	public static boolean areAnagrams(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
			return false;
		for(char c='a';c<='z';c++)
		{
			int count1=0,count2=0;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==c)
					count1++;
			}
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)==c)
					count2++;
			}
		if(count1!=count2)
			return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first word:");
		String str1=scanner.nextLine();
		System.out.print("Enter second word:");
		String str2=scanner.nextLine();
		scanner.close();
		if(areAnagrams(str1,str2))
			System.out.print("The words are anagrams!");
		else
			System.out.print("The words are not anagrams");
	}
}