import java.util.Scanner;
public class Smallest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number 1:");
		int num1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter a number 2:");
		int num2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter a number 3:");
		int num3=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		String result=(num1<num2&&num1<num3)?"Yes":"No";
		System.out.print("Is the first number the smallest? "+result);
	}
}