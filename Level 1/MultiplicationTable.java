import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner  scanner=new Scanner(System.in);
		System.out.print("Enter a number to find multiplication table:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int mul[]=new int[10];
		for(int i=1;i<=10;i++)
			mul[i-1]=n*i;
		System.out.println("\nMultiplication Table of "+n);
		for(int i=0;i<10;i++)
			System.out.println(n+"*"+(i+1)+"="+mul[i]);
	}
}
			