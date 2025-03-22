import java.util.Scanner;
public class StringComparison{
	public static boolean compareStringsChar(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first string:");
		String str1=scanner.nextLine();
		System.out.print("Enter the second string:");
		String str2=scanner.nextLine();
		scanner.close();
		boolean equalsComparison=(str1.equals(str2));
		System.out.println("Comparison using equals:"+equalsComparison);
		boolean charAtComparison=compareStringsChar(str1,str2);
		System.out.println("Comparison using charAt:"+charAtComparison);
		System.out.print((equalsComparison==charAtComparison)?"Both comparisons methods give same result":"Comparison methods give different result");
	}
}	