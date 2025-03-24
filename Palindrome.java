import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		boolean isPalindrome=true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.print(isPalindrome?"Palindrome":"Not Palindrome");
	}
}