import java.util.Scanner;
public class TotalRounds{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the length of 1st side:");
		int side1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the length of 2nd side:");
		int side2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the length of 3rd side:");
		int side3=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int perimeter=side1+side2+side3;
		int rounds=perimeter/5000;
		System.out.print("The total number of rounds the athlete will run is "+rounds+" to complete 5km");
	}
}