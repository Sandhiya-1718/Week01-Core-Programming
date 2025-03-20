import java.util.Scanner;
public class YoungestTallest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String names[]={"Amar","Akbar","Anthony"};
		int age[]=new int[3];
		double height[]=new double[3];
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter age of  "+names[i]+":");
			age[i]=scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter the height of "+names[i]+":");
			height[i]=scanner.nextDouble();
			scanner.nextLine();
		}
		int youngest=0;
		for(int i=1;i<3;i++)
		{
			if(age[i]<age[youngest])
				youngest=i;
		}
		int tallest=0;
		for(int i=1;i<3;i++)
		{
			if(height[i]>height[tallest])
				tallest=i;
		}
		System.out.println("The youngest friend is "+names[youngest]+" with age "+age[youngest]);
		System.out.print("The tallest friend is "+names[tallest]+" with height "+height[tallest]);
	}
}
