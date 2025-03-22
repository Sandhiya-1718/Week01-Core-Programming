import java.util.Scanner;
public class Palindrome{
	public static boolean usingIterative(String s)
	{
		int start=0,end=s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static boolean usingRecursive(String s,int start,int end)
	{
		if(start>=end)
			return true;
		if(s.charAt(start)!=s.charAt(end))
			return false;
		return usingRecursive(s,start+1,end-1);
	}
	public static boolean usingCharArray(String s)
	{
		char original[]=s.toCharArray();
		char reversed[]=new char[original.length];
		for(int i=0;i<original.length;i++)
			reversed[i]=original[original.length-1-i];
		for(int i=0;i<original.length;i++)
		{
			if(original[i]!=reversed[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		System.out.println("Palindrome check using Iterative:"+usingIterative(s));
		System.out.println("Palindrome check using Recursive:"+usingRecursive(s,0,s.length()-1));
		System.out.println("Palindrome check using CharArray:"+usingCharArray(s));
	}
}