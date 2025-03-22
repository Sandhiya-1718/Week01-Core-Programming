import java.util.Scanner;
public class UniqueCharacters{
	public static int getStringLength(String s)
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
		catch(IndexOutOfBoundsException e)
		{
		}
		return count;
	}
	public static char[] findUniqueCharacters(String s)
	{
		int count=getStringLength(s);
		char[] uniqueCharacters=new char[count];
		int uniqueCount=0;
		for(int i=0;i<count;i++)
		{	
			boolean isUnique=true;
			for(int j=0;j<uniqueCount;j++)
			{ 
				if(s.charAt(i)==uniqueCharacters[j])
				{
					isUnique=false;
					break;
				}
			}
			if(isUnique)
			{
				uniqueCharacters[uniqueCount]=s.charAt(i);
				uniqueCount++;
			}
		}
		return uniqueCharacters;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=scanner.nextLine();
		scanner.close();
		char uniqueCharacters[]=findUniqueCharacters(s);
		System.out.print("Unique Characters:");
		for(int i=0;i<uniqueCharacters.length;i++)
			System.out.print(uniqueCharacters[i]+" ");
	}
}