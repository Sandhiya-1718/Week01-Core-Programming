import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to reverse:");
		int num=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int temp=num, count=0;
		while (temp>0)
		{
			count++;
			temp/=10;
		}
		int digits[]=new int[count];
		for(int i=0;i<count;i++)
		{
			digits[i]=num%10;
			num/=10;
		}
		int reverse[]=new int[count];
		for(int i=0;i<count;i++)
			reverse[i]=digits[count-1-i];
		System.out.print("The digits are ");
		for(int i=0;i<count;i++)
			System.out.print(reverse[count-1-i]+" ");
	}
}