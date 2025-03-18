import java.util.Scanner;
public class Weight{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the weight in pounds:");
		double pounds=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double kg=pounds*(1/2.2);
		System.out.print("The weight of the person in pound is "+pounds+" and in kg is "+kg);
	}
}