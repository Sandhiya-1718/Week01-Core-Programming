import java.util.Scanner;
public class UniqueFrequency{
	public static char[] findUnique(String s)
	{
		char unique[]=new char[s.length()];
		int uniqueCount=0;
		for(int i=0;i<s.length();i++)
		{	
			boolean isUnique=true;
			for(int j=0;j<uniqueCount;j++)
			{ 
				if(s.charAt(j)==unique[i])
				{
					isUnique=false;
					break;
				}
			}
			if(isUnique)
			{
				unique[uniqueCount]=s.charAt(i);
				uniqueCount++;
			}
		}
		return unique;
	}
	public static String[][] findFrequency(String s)
	{
		int frequency[]=new int[256];
		for(int i=0;i<s.length();i++)
            frequency[s.charAt(i)]++;
        char uniqueChars[]=findUnique(s);
		String frequencyData[][]=new String[uniqueChars.length][2];
		for(int i=0;i<uniqueChars.length;i++) 
		{
            frequencyData[i][0]=String.valueOf(uniqueChars[i]);
            frequencyData[i][1]=String.valueOf(frequency[uniqueChars[i]]);
        }

        return frequencyData;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		String result[][]=findFrequency(s);
		System.out.println("Character with their frequencies:");
		for(int i=0;i<result.length;i++)
			System.out.println(result[i][0]+" : "+result[i][1]);
	}
}
		