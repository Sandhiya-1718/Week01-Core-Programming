import java.util.Scanner;
public class RandomArrayOps {
	public static int[] generate4DigitRandomArray(int n)
	{
       int numbers[]=new int[5];
       int min=(int)Math.pow(10,n-1);
       int max=(int)Math.pow(10,n)-1;
       for(int i=0;i<5;i++) 
		   numbers[i]=min+(int)(Math.random()*(max-min+1));
       return numbers;
	}
	public static double[] findAverageMinMax(int[] n) 
	{
        double sum=0;
        int min=n[0];
        int max=n[0];
        for (int i=0;i<n.length;i++) 
		{
            sum+=n[i];
            if(n[i]<min)
				min=n[i];
            if(n[i]>max)
				max=n[i];
        }
        double avg=sum/n.length; 
        return new double[]{avg,min,max}; 
    }
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int digits=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
        int list[]=generate4DigitRandomArray(digits);
		System.out.print("Generated Numbers: ");
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
		double result[]=findAverageMinMax(list);
		System.out.println("Average :"+result[0]);
		System.out.println("Minimum :"+result[1]);
		System.out.println("Maximum :"+result[1]);
	}
}