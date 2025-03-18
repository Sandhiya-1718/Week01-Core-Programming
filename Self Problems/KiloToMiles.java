import java.util.Scanner;
import java.lang.Math;
public class KiloToMiles{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter kilometer:");
		double km=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.print(km+"km to miles is "+(km*0.621371));
	}
}