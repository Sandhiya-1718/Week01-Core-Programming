import java.util.Scanner;
public class Bonus{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the salary:Rs.");
		int salary=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter year of service:");
		int service=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(service>5)
		{
			float bonus=salary*0.05f;
			System.out.print("Bonus amount:Rs."+bonus);
		}
		else
			System.out.print("No bonus");
	}
}