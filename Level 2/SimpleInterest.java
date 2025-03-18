import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the principal amount:");
		double principal=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the rate of interest:");
		double rate=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the Time period:");
		int time=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		double simpleInterest=(principal*rate*time)/100;
		System.out.print("The simple interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
}