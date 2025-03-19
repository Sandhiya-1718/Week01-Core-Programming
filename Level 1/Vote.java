import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter age:");
		int age=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(age>=18)
			System.out.print("The person's age is "+age+" and can vote.");
		else
			System.out.print("The person's age is "+age+" and cannot vote.");
	}
}