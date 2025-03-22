import java.util.Scanner;
public class SplitString{
    public static int findLengthOfString(String s) 
	{
        int count=0;
        try 
		{
            while(true)
			{
                s.charAt(count);
                count++;
            }
        }
		catch(StringIndexOutOfBoundsException e) 
		{
			return count;
        }
    }
    public static String[] customSplit(String s)
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
    public static boolean compareArrays(String arr1[],String arr2[]) {
        if(arr1.length!=arr2.length) 
            return false;
        for (int i=0;i<arr1.length;i++) 
		{
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String input=scanner.nextLine();
        scanner.close();
        String customWords[]=customSplit(input);
        String builtInWords[]=input.split(" ");
        System.out.println(compareArrays(customWords, builtInWords) ? "Both methods give the same result" : "Mismatch in results!");
        System.out.println("\nCustom Split Words:");
        for(int i=0;i<customWords.length;i++) 
            System.out.println(customWords[i]);
        System.out.println("\nBuilt-in Split Words:");
        for(int i=0;i<builtInWords.length;i++) 
            System.out.println(builtInWords[i]);
		System.out.print(compareArrays(customWords,builtInWords)?"Both arrays are same":"Both arrays are different");
	}
}
