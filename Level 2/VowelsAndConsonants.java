import java.util.Scanner;
public class VowelsAndConsonants{
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
	public static int[] countVowelsAndConsonants(String s)
	{
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String type=checkCharacter(ch);
			if(type.equals("Vowels"))
				vowels++;
			else if(type.equals("Consonants"))
				consonants++;
		}
		return new int[]{vowels,consonants};
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		scanner.close();
		int counts[]=countVowelsAndConsonants(s);
		System.out.println("Vowels     :"+counts[0]);
		System.out.println("Consonants :"+counts[1]);
	}
}