import java.util.Scanner;
public class LeapYear2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the year:");
		int year=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		while(true)
		{
			if(year>=1582)
			{
				if(year%400==0||(year%4==0&&year%100!=0))
				{
					System.out.print("It is a leap year");
					break;
				}
				else
				{
					System.out.print("It is not a leap year");
					break;
				}
			}
			else
				System.out.print("Enter a year greater than 1582:");
		}
	}
}