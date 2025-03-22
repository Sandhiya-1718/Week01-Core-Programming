import java.util.Scanner;
public class DisplayCharacterType{
	public static String checkCharacter(char ch)
	{
		if(ch>='A'&&ch<='Z')
			ch=(char)(ch+32);
		if(ch>='a'&&ch<='z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				return "Vowels";
			else 
				return "Consonants";
		}
		return "Not a letter";
	}
	public static void countVowelsAndConsonants(String s)
	{
		System.out.println("\n-----------------------------");
		System.out.printf("%10s %15s","Character","Type");
		System.out.println("\n-----------------------------");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String type=checkCharacter(ch);
			System.out.printf("%10s %15s\n",ch,type);
		}
		System.out.println("\n-----------------------------");
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		scanner.close();
		countVowelsAndConsonants(s);
	}
}