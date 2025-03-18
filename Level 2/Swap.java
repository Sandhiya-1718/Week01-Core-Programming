import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number 1:");
		int number1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the number 2:");
		int number2=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.print("The swapped numbers are "+number1+" and "+number2);
	}
}