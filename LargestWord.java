import java.util.Scanner;
public class LargestWord{
	public static String findLongestWord(String s)
	{
		String words[]=s.split(" ");
		String longWord="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>longWord.length())
				longWord=words[i];
		}
		return longWord;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		scanner.close();
		String longestWord=findLongestWord(s);
		System.out.print("Longest word:"+longestWord);
	}
}