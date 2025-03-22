import java.util.Scanner;
public class ShortestAndLongestString{
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
	public static String[] findShortestAndLongest(String words[])
	{
		String shortest=words[0];
		String longest=words[0];
		for(int i=1;i<words.length;i++)
		{	
			if(getStringLength(words[i])<getStringLength(shortest))
				shortest=words[i];
			if(getStringLength(words[i])>getStringLength(longest))
				longest=words[i];
		}
		return new String[]{shortest,longest};
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		scanner.close();
		String words[]=splitWords(s);
		String minMax[]=findShortestAndLongest(words);
		System.out.println("Shortest word:"+minMax[0]);
		System.out.println("Longest word:"+minMax[1]);
	}
}