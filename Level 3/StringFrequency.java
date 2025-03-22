import java.util.Scanner;
public class StringFrequency{
	public static String[] findFrequency(String s)
	{
		char chars[]=s.toCharArray();
		int frequency[]=new int[chars.length];
		String result[]=new String[chars.length];
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]=='0')
				continue;
			frequency[i]=1;
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]==chars[j])
				{
					frequency[i]++;
					chars[j]='0';
				}
			}
			result[i]=chars[i]+":"+frequency[i];
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		String result[]=findFrequency(s);
		System.out.println("Characters with their frequency:");
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=null)
				System.out.println(result[i]);
		}
	}
}
