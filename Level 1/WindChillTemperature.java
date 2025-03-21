import java.util.Scanner;
import java.lang.Math;
public class WindChillTemperature{
	public static double calculateWindChill(double temperature,double windSpeed)
	{
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
		return windChill;
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter temperature:");
		double temp=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter windspeed:");
		double windSpeed=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		System.out.print("Wind Chill Temperature:"+calculateWindChill(temp,windSpeed));
	}
}