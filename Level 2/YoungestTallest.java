import java.util.Scanner;
public class YoungestTallest{
	public static int youngest(int age[])
	{
		int minAge=0;
		for(int i=1;i<3;i++)
		{
			if(age[i]<age[minAge])
				minAge=i;
		}
		return minAge;
	}
	public static int tallest(int height[])
	{
		int maxHeight=0;
		for(int i=1;i<3;i++)
		{
			if(height[i]>height[maxHeight])
				maxHeight=i;
		}
		return maxHeight;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String names[]={"Amar","Akbar","Anthony"};
		int age[]=new int[3];
		int height[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter age of "+names[i]+" :");
			age[i]=scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter height of "+names[i]+" :");
			height[i]=scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		int youngest=youngest(age);
		int tallest=tallest(height);
		System.out.println(names[youngest]+" is the youngest with age "+age[youngest]);
		System.out.println(names[tallest]+" is the tallest with height "+height[youngest]);
	}
}