import java.util.Scanner;
public class DivideChocolates{
	public static int[] divideChocolates(int chocolate,int children)
	{
		int chocolatesPerChild=chocolate/children;
		int remainingChocolates=chocolate%children;
		return new int[]{chocolatesPerChild,remainingChocolates};
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of chocolates:");
		int numberOfChocolate=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the number of childrens:");
		int numberOfChildren=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int result[]=divideChocolates(numberOfChocolate,numberOfChildren);
		System.out.print("The number of chocolates each child gets is "+result[0]+" and the number of remaining chocolates are "+result[1]);
	}
}