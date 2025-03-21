import java.util.Scanner;
public class Leapyear{
	public static boolean isLeapyear(int year)
	{
		return (year>=1582)&&((year%400==0)||(year%4==0&&year%100!=0));
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a year:");
		int year;
		while(true)
		{
			year=scanner.nextInt();
			scanner.nextLine();
			if(year>=1582)
				break;
			System.out.print("Please enter a year greater than 1582:");
		}
		scanner.close();
		System.out.print(isLeapyear(year)?year+" is a leap year":year+" is not a leap year");
	}
}