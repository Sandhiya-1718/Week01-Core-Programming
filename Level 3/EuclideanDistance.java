import java.util.Scanner;
public class EuclideanDistance{
	public static double findDistance(int x1,int x2,int y1,int y2)
	{
		return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
	}
	public static double[] findLineEquation(int x1,int x2,int y1,int y2)
	{
		double m=((double)y2-y1)/(x2-x1);
		double b=y1-(m*x1);
		return new double[]{m,b};
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value of x1:");
		int x1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of x2:");
		int x2=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of y1:");
		int y1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter value of y2:");
		int y2=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.println("Euclidean Distance: "+findDistance(x1,x2,y1,y2));
		if (x1 == x2)
			System.out.println("The line is vertical, equation: x="+x1);
        else 
		{
			double equation[]=findLineEquation(x1,x2,y1,y2);
			System.out.println("Equation of line: y="+equation[0]+"x+"+equation[1]);
		}
	}
}