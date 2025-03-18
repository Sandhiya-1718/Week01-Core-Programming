public class DiscountFeesCalculation{
	public static void main(String[] args){
		int fee=125000, discountPercent=10;
		int discount=fee-(fee*discountPercent/100);
	System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}