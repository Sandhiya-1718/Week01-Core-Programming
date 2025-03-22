import java.util.Scanner;
public class FirstNonRepeatingCharacter{
	public static char findfirstNotRepeating(String s)
	{
		int frequency[]=new int[256];
		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			frequency[ch]+=1;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(frequency[ch]==1)
				return ch;
		}
		return '\0';
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=scanner.nextLine();
		scanner.close();
		char result=findfirstNotRepeating(s);
		if (result != '\0')
			System.out.println("First Non-Repeating Character:"+result);
        else
			System.out.println("No Non-Repeating Character Found.");
	}
}