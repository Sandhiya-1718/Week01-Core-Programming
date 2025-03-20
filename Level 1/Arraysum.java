import java.util.Scanner;
public class ArraySum{
	public static void main(String[] args){
		Scanner  scanner=new Scanner(System.in);
		double total=0.0;
		int i=0;
		double ar[]=new double[10];
		while(true)
		{
			System.out.print("Enter a number or zero/negative number to stop:");
			double num=scanner.nextDouble();
			scanner.nextLine();
			if(num<=0)
				break;
			ar[i]=num;
			i++;
			if(i==ar.length)
				break;
		}
		scanner.close();
		System.out.print("Numbers entered:");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"  ");
			total+=ar[i];
		}
		System.out.print("\nTotal value:"+total);
	}
}
			