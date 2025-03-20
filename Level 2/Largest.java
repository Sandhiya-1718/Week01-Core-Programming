import java.util.Scanner;
public class Largest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int maxDigit=10;
		int digits[]=new int[maxDigit];
		int index=0;
		while(n>0)
		{
			int digit=n%10;
			digits[index]=digit;
			index++;
			n/=10;
			if(index==maxDigit)
				break;
		}
		int largest=0,secondLargest=0;
		for(int i=0;i<index;i++)
		{
			if(digits[i]>largest)
			{
				secondLargest=largest;
				largest=digits[i];
			}
			else if(digits[i]>secondLargest&&digits[i]!=largest)
				secondLargest=digits[i];
		}
		System.out.print("Digits:");
		for(int i=0;i<index;i++)
			System.out.print(digits[i]+"  ");
		System.out.println("\nLargest digit:"+largest);
		System.out.print("Second Largest digit:"+secondLargest);
	}
}