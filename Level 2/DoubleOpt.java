import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number:");
		double a=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter second number:");
		double b=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter third number:");
		double c=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double s=a+b*c;
		double t=a*b+c;
		double u=c+a/b;
		double v=a%b+c;
		System.out.print("The results of Int Operations are "+s+","+t+","+u+"and"+v);
	}
}