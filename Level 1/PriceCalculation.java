import java.util.Scanner;
public class PriceCalculation{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the unit price:Rs.");
		float unitPrice=scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Enter the quantity:");
		int quantity=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print("The total purchase price in INR "+(unitPrice*quantity)+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}