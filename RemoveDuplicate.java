import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		StringBuilder unique=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<unique.length();j++)
			{
				if(s.charAt(i)==unique.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
				unique.append(s.charAt(i));
		}
		System.out.print("After removing duplicates"+unique);		
	}
}