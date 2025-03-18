import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter second number:");
		int b=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter third number:");
		int c=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int s=a+b*c;
		int t=a*b+c;
		int u=c+a/b;
		int v=a%b+c;
		System.out.print("The results of Int Operations are "+s+","+t+","+u+"and"+v);
	}
}