public class Football{
	public static int sum(int height[])
	{
		int sum=0;
		for(int i=0;i<height.length;i++)
			sum+=height[i];
		return sum;
	}
	public static double mean(int height[])
	{
		return sum(height)/height.length;
	}
	public static int shortest(int height[])
	{
		int shortest=height[0];
		for(int i=1;i<height.length;i++)
		{
			if(height[i]<shortest)
				shortest=height[i];
		}
		return shortest;
	}
	public static int tallest(int height[])
	{
		int tallest=height[0];
		for(int i=1;i<height.length;i++)
		{
			if(height[i]>tallest)
				tallest=height[i];
		}
		return tallest;
	}
	public static void main(String[] args)
	{
		int height[]=new int[11];
		System.out.print("Heights in cm:");
		for(int i=0;i<11;i++)
		{
			height[i]=150+(int)(Math.random()*(250-150+1));
			System.out.print(height[i]+" ");
		}
		int totalSum=sum(height);
		double mean=mean(height);
		int shortest=shortest(height);
		int tallest=tallest(height);
		System.out.println("\nSum            :"+totalSum);
		System.out.println("Mean Height    :"+mean);
		System.out.println("Shortest Height:"+shortest);
		System.out.println("Tallest Height :"+tallest);
	}
}
		