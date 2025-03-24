import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=scanner.nextLine();
		scanner.close();
		StringBuilder reverse=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
			reverse.append(s.charAt(i));
		System.out.print("Reversed String:"+reverse);
	}
}