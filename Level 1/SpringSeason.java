import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the month:");
		int month=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the day:");
		int day=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if((month<3&&day<20&&day>31)||(month<4&&day<1&&day>30)||(month<5&&day<1&&day>31)||(month<6&&day<1&&day>20))
			System.out.print("It's a Spring Season");
		else
			System.out.print("Not a Spring Season");
	}
}