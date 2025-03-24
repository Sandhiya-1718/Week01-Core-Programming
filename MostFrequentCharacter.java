import java.util.Scanner;
public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        char mostFrequentChar=str.charAt(0);
        int maxFrequency=0;
        for(int i=0;i<str.length();i++) 
		{
            char currentChar=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++) 
			{
                if(str.charAt(j)==currentChar) 
                    count++;
            }
            if(count>maxFrequency) 
			{
                maxFrequency=count;
                mostFrequentChar=currentChar;
            }
        }
        return mostFrequentChar;
    }
    public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String str=scanner.nextLine();
		scanner.close();
        char result=findMostFrequentChar(str);
        System.out.println("Most Frequent Character:'"+result+"'");
    }
}
