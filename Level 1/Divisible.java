import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		String result=(num%5==0)?"Yes":"No";
		System.out.print("Is the number "+num+" divisible by 5? "+result);
	}
}