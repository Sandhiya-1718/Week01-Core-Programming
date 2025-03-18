import java.util.Scanner;
public class ChocolatesDivide{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of chocolates:");
		int chocolates=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the number of childrens:");
		int childrens=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("The number of chocolates each child gets is "+(chocolates/childrens)+" and the number of remaining chocolates are "+(chocolates%childrens));
	}
}