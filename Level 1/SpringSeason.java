import java.util.Scanner;
public class SpringSeason{
	public static boolean spring(int month,int date)
	{
	if((month<3&&date<20&&date>31)||(month<4&&date<1&&date>30)||(month<5&&date<1&&date>31)||(month<6&&date<1&&date>20))
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the month:");
		int month=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the date:");
		int date=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		boolean result=spring(month,date);
		System.out.print("It is "+(result?"a Spring Season":"not a Spring Season"));
	}		
}