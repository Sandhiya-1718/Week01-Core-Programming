import java.util.Scanner;
public class KilometersToMiles2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter kilometer:");
		double km=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double miles=km*0.621371;
		System.out.print("The total mile is "+miles+" mile for the given "+km+" km");
	}
}