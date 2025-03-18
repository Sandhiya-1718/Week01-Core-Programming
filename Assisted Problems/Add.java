import java.util.Scanner;
public class Add{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter 2nd number:");
		int b=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("Sum of "+a+" and "+b+" is "+(a+b));
	}
}