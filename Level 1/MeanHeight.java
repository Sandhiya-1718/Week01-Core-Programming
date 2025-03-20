import java.util.Scanner;
public class MeanHeight{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double height[]=new double[11];
		double sum=0.0,mean=0.0;
		for(int i=0;i<11;i++)
		{
			System.out.print("Enter height of player "+(i+1)+":");
			height[i]=scanner.nextDouble();
			scanner.nextLine();
		}
		for(int i=0;i<11;i++)
			sum+=height[i];
		mean=sum/11;
		System.out.print("Mean height of the football team:"+mean);
	}
}
	