import java.util.Scanner;
public class ReplaceWord{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		System.out.print("Enter word to replace:");
		String oldWord=scanner.nextLine();
		System.out.print("Enter new word:");
		String newWord=scanner.nextLine();
		scanner.close();
		String updatedSentence=s.replace(oldWord,newWord);
		System.out.print("Updated sentence:"+updatedSentence);
	}
}