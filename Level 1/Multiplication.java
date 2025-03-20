import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
		Scanner  scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int mul[]=new int[4];
		for(int i=0;i<4;i++)
			mul[i]=n*(i+6);
		for(int i=0;i<4;i++)
			System.out.println(n+"*"+(i+6)+"="+mul[i]);
	}
}