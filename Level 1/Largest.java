import java.util.Scanner;
public class Largest{
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
		String result1,result2,result3;
		if(num1>num2&&num1>num3)
			result1="Yes";
		else
			result1="No";
		
		if(num2>num1&&num2>num3)
			result2="Yes";
		else
			result2="No";
		
		if(num3>num1&&num3>num2)
			result3="Yes";
		else
			result3="No";
		System.out.println("Is the first number the largest? "+result1);
		System.out.println("Is the second number the largest? "+result2);
		System.out.print("Is the third number the largest? "+result3);
	}
}