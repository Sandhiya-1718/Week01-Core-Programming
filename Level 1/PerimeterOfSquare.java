import java.util.Scanner;
public class PerimeterOfSquare{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the perimeter:");
		float perimeter=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("The length of the side is "+(perimeter/4)+" whose perimeter is "+perimeter);
	}
}