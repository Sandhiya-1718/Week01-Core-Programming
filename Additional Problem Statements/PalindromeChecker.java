import java.util.Scanner;
public class PalindromeChecker{
	public static String getInput(Scanner scanner,String prompt)
	{
		System.out.print(prompt);
		return scanner.nextLine();
	}
	public static boolean checkPalindrome(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(i<(s.length()-1-i))
			{
				if(s.charAt(i)!=s.charAt(s.length()-1-i))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String s=getInput(scanner,"Enter a word:");
		System.out.println(checkPalindrome(s)?"The word is a palindrome":"The word is not a palindrome");
		scanner.close();
	}
}