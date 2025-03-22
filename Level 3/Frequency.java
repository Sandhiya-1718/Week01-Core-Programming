import java.util.Scanner;
public class Frequency{
	public static int[][] findfrequency(String s)
	{
		int frequency[]=new int[256];
		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			frequency[ch]+=1;
		}
		int uniqueCount=0;
		for(int i=0;i<256;i++)
		{
			if(frequency[i]>0)
				uniqueCount++;
		}
		int result[][]=new int[uniqueCount][2];
		int index=0;
		for(int i=0;i<256;i++)
		{
			if(frequency[i]>0)
			{
				result[index][0]=i;
				result[index][1]=frequency[i];
				index++;
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=scanner.nextLine();
		scanner.close();
		int result[][]=findfrequency(s);
		System.out.println("Character with their frequencies:");
		for(int i=0;i<result.length;i++)
			System.out.println((char)result[i][0]+" : "+result[i][1]);
	}
}