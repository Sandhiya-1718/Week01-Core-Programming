import java.util.Scanner;
public class WordLength{
	public static String[] splitWords(String s)
	{
		int wordCount=1;
		for(int i=0;i < s.length();i++) 
		{
            if(s.charAt(i)==' ') 
				wordCount++;
        } 
        String words[]=new String[wordCount];
        int start=0,index=0;
        for(int i=0;i<s.length();i++) 
		{
            if(s.charAt(i)==' ')
			{
                words[index]=s.substring(start,i);
				index++;
                start=i+1;
            }
        }
        words[index]=s.substring(start);
        return words;
    }
	public static int getStringLength(String str) 
	{
        int length=0;
        for(int i=0;i<str.toCharArray().length;i++)
            length++;
        return length;
    }
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String sentence=scanner.nextLine();
		scanner.close();
		String words[]=splitWords(sentence);
		String wordLength[][]=new String[words.length][2];
		for(int i=0;i<words.length;i++)
		{
			wordLength[i][0]=words[i];
			wordLength[i][1]=String.valueOf(getStringLength(words[i]));
		}
		for(int i=0;i<wordLength.length;i++)
			System.out.println(wordLength[i][0]+":"+wordLength[i][1]);
	}
}