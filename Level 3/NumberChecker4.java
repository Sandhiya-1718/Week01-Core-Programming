import java.util.Scanner;
public class NumberChecker4{
	public static int count(int number)
	{
		int count=0;
		while(number>0){
			number/=10;
			count++;
		}
		return count;
	}
	public static int[] digits(int number)
	{
        int length=count(number);
        int digits[]=new int[length];
        for(int i=length-1;i>=0;i--) {
            digits[i]=number%10;
            number/=10;
        }
        return digits;
    }
	public static boolean prime(int number)
	{
		if(number<2)
			return false;
		for(int i=2;i<number;i++){
			if(number%i==0)
				return false;
		} 
		return true;	
	}
	
	public static boolean neon(int number,int digits[]) 
	{
        int square=0;
		for(int i=0;i<digits.length;i++)
			square+=Math.pow(digits[i],2);
		return square==number;
    }
    public static boolean spy(int digits[]) 
	{
        int sum=0;
		for(int i=0;i<digits.length;i++)
			sum+=digits[i];
		int product=1;
		for(int i=0;i<digits.length;i++)
			product*=digits[i];
		return sum==product;
    }
	public static boolean automorphic(int number)
	{
		int square=number*number;
        int temp=number,divisor=1;
		while (temp>0)
		{
			divisor*=10;
			temp/=10;
		}
        return square%divisor==number;
	}
	public static boolean buzz(int number)
	{
		if(number%7==0||number%10==7)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int count=count(num);
		int digitArray[]=digits(num);
		System.out.println("Prime? "+prime(num));
		System.out.println("Neon? "+neon(num,digitArray));
		System.out.println("Spy? "+spy(digitArray));
		System.out.println("Automorphic? "+automorphic(num));
		System.out.println("Buzz? "+buzz(num));
	}
}