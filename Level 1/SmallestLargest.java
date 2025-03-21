import java.util.Scanner;
import java.lang.Math;
public class SmallestLargest{
	public static int[]findSmallestAndLargest(int a,int b,int c){
		int largest=Math.max(a,Math.max(b,c));
		int smallest=Math.min(a,Math.min(b,c));
		return new int[]{largest,smallest};
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the second number:");
		int num2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the third number:");
		int num3=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int result[]=findSmallestAndLargest(num1,num2,num3);
		System.out.println(result[0]+" is the largest number");
		System.out.print(result[1]+" is the smallest number");
	}
}