import java.util.Scanner;
public class PositiveNegative{
	public static int checkNumber(int n)
	{
		if(n>0)
			return 1;
		else if(n<0)
			return -1;
		else
			return 0;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int result=checkNumber(num);
		System.out.println("The number is:"+(result==1?"Positive":result==-1?"Negative":"Zero"));
	}
}