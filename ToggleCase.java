import java.util.Scanner;
public class ToggleCase{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String str=scanner.nextLine();
		scanner.close();
		StringBuilder newSentence=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				newSentence.append(Character.toUpperCase(ch));
			else if(ch>='A'&&ch<='Z')
				newSentence.append(Character.toLowerCase(ch));
			else
				newSentence.append(ch);
		}
		System.out.print("New Sentence:"+newSentence);
	}
}