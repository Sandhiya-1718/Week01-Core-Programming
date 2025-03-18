import java.util.Scanner;
public class Income{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the salary:Rs.");
		int salary=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the bonus:Rs.");
		int bonus=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("The salary is INR "+salary+" and bonus s INR "+bonus+". Hence Total Income is INR "+(salary+bonus));
	}
}