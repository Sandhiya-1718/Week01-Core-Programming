import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter base in centimeter:");
		float base=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter height in centimeter:");
		float height=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		float baseinches=base/2.54f;
		float heightinches=height/2.54f;
		float area=(float)1/2*base*height;
		float areainches=(float)1/2*baseinches*heightinches;
		System.out.print("The area of triangle in centimetes is "+area+" and in inches is "+areainches);
	}
}