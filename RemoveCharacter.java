import java.util.Scanner;
public class RemoveCharacter{
	public static String characterRemoving(String s,char remove)
	{
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==remove)
				continue;
			res.append(s.charAt(i));
		}
		return res.toString();
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String s=scanner.nextLine();
		System.out.print("Enter the letter to be removed:");
		char remove=scanner.next().charAt(0);
		scanner.close();
		System.out.print("After removing the character "+remove+":"+characterRemoving(s,remove));
	}
}	