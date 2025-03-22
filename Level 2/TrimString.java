import java.util.Scanner;
public class TrimString{
	public static int[] findTrimIndices(String s)
	{
		int start=0,end=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				start=i;
				break;
			}
		}
		for(int i=s.length()-1;i>0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				end=i;
				break;
			}
		}
		return new int[]{start,end};
	}
	public static String definedSubstring(String s,int start,int end)
	{
		StringBuilder result=new StringBuilder();
		for(int i=start;i<=end;i++)
			result.append(s.charAt(i));
		return result.toString();
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		scanner.close();
		int indices[]=findTrimIndices(s);
		String userDefinedTrim=definedSubstring(s,indices[0],indices[1]);
		String buildInTrim=s.trim();
		System.out.println("Manual Trim:"+userDefinedTrim);
		System.out.println("Build In Trim:"+buildInTrim);
	}
}