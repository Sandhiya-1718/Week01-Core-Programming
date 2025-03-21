import java.util.Scanner;
public class BmiCalculation{
	public static double calculateBmi(double height,double weight)
	{
		double heightM=height/100;
		return weight/(heightM*heightM);
	}
	public static String getBmiStatus(double bmi)
	{
		if(bmi<18.5)
			return "Underweight";
		else if(bmi<24.9)
			return "Normal";
		else if(bmi<29.9)
			return "Overweight";
		else
			return "Obese";
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		double details[][]=new double[10][3];
		String weightStatus[]=new String[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the details of person "+(i+1)+":");
			System.out.print("Enter height in m:");
			details[i][0]=scanner.nextDouble();
			scanner.nextLine();
			while(details[i][0]<=0)
			{
				System.out.print("Invalid number.!Please enter a positive height:");
				details[i][0]=scanner.nextDouble();
				scanner.nextLine();
			}
			System.out.print("Enter weight in kg:");
			details[i][1]=scanner.nextDouble();
			scanner.nextLine();
			while(details[i][1]<=0)
			{
				System.out.print("Invalid number.!Please enter a positive weight:");
				details[i][1]=scanner.nextDouble();
				scanner.nextLine();
			}
		}
		scanner.close();
		for(int i=0;i<10;i++)
		{
			details[i][2]=calculateBmi(details[i][0],details[i][1]);
			System.out.println();
			System.out.println("Details of person "+(i+1));
			System.out.println("Height  :"+details[i][0]);
			System.out.println("Weight  :"+details[i][1]);
			System.out.println("BMI     :"+details[i][2]);
			System.out.println("Remarks :"+getBmiStatus(details[i][2]));
		}
	}
}