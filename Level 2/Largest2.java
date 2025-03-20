import java.util.Scanner;
public class Largest2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number:");
		long n=scanner.nextLong();
		scanner.nextLine();
		scanner.close();
		int maxDigit=10;
		int digits[]=new int[maxDigit];
		int index=0;
		while(n>0)
		{
			if(index==maxDigit)
			{
				maxDigit+=10;
				int temp[]=new int[maxDigit];
				for(int i=0;i<index;i++)
					temp[i]=digits[i];
				digits=temp;
			}
			digits[index]=(int)n%10;
			index++;
			n/=10;
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