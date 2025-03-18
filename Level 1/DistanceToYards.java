import java.util.Scanner;
public class DistanceToYards{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the distance:");
		int distanceFeet=scanner.nextInt();
		scanner.nextLine();
		double distanceyards=distanceFeet/3;
		double distancemiles=distanceyards/1760;
		System.out.print("Your distance in feet is "+distanceFeet+" while in yards is "+distanceyards+" and in miles is "+distancemiles);
	}
}