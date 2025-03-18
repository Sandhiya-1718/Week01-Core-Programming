import java.util.Scanner;
public class DiscountFeesCalculation2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the fee amount:Rs.");
		int fee=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the Discount Percent:");
		int discountPercent=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		double discount=(double)fee*(discountPercent/100.0);
	System.out.print("The discount amount is INR "+discount+" and final discountd fee is INR "+(fee-discount));
	}
}