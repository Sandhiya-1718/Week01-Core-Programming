import java.util.Scanner;
public class HeightConversion{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your height in cm:");
		float centimeter=scanner.nextFloat();
		scanner.nextLine();
		scanner.close();
		float inches=centimeter/2.54f;
		float feet=inches/12f;
		System.out.print("Your Height in cm is "+centimeter+" while in feet is "+feet+" and inches is "+inches);
	}
}