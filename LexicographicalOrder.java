import java.util.Scanner;
public class LexicographicalOrder{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter string 1:");
		String s1=scanner.nextLine();
		System.out.print("Enter string 2:");
		String s2=scanner.nextLine();
		scanner.close();
		int result=s1.compareTo(s2);
		if(result<0)
			System.out.print("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
		else if(result>0)
			System.out.print("\""+s2+"\" comes before \""+s1+"\" in lexicographical order");
		else
			System.out.print("\""+s1+"\" and \""+s2+"\" are equal");
	}
}