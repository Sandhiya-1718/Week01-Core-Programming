import java.util.Scanner;
public class RemainderQuotient{
	public static int[]findQuotientRemainder(int a,int b){
		int remainder=a%b;
		int quotient=a/b;
		return new int[]{remainder,quotient};
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the second number:");
		int num2=scanner.nextInt();
		scanner.nextLine();
		int result[]=findQuotientRemainder(num1,num2);
		System.out.println("Quotient :"+result[1]);
		System.out.print("Remainder:"+result[0]);
	}
}