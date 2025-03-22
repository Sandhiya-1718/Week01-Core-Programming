import java.util.Scanner;
public class BmiCalculation{
	public static double[][] getWeightHeight(int n,Scanner scanner)
	{
		double data[][]=new double[n][2];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter weight(kg) for person:"+(i+1)+":");
			data[i][0]=scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter height(cm) for person:"+(i+1)+":");
			data[i][1]=scanner.nextDouble();
			scanner.nextLine();
		}
		return data;
	}
	public static String[][] calculateBmi(double data[][])
	{
		String bmiResults[][]=new String[data.length][4];
		for(int i=0;i<data.length;i++)
		{
			double weight=data[i][0];
            double height=data[i][1]/100.0;
            double bmi=Math.round((weight/(height*height))*100.0)/100.0; // Rounded to 2 decimals
            String status; 
			if(bmi<=18.4)
				status="Underweight";
			else if(bmi<=24.9)
				status="Normal";
			else if(bmi<=39.9)
				status="Overweight";
			else
				status="Obese";
			bmiResults[i][0]=String.format("%.1f",weight);
			bmiResults[i][1]=String.format("%.1f",height);
			bmiResults[i][2]=String.format("%.2f",bmi);
			bmiResults[i][3]=status;
		}
		return bmiResults;
	}
	public static void displayResult(String bmiResults[][])
	{
		System.out.println("------------------------------------------------------------");
		System.out.printf("%8s %10s %10s %10s %15s\n","Person","Weight","Height","BMI","Status");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<bmiResults.length;i++)
			System.out.printf("%8d %10s %10s %10s %15s\n",(i+1),bmiResults[i][0],bmiResults[i][1],bmiResults[i][2],bmiResults[i][3]);
		System.out.println("------------------------------------------------------------");
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of persons:");
		int persons=scanner.nextInt();
		scanner.nextLine();
		double weightHeightData[][]=getWeightHeight(persons,scanner);
		String results[][]=calculateBmi(weightHeightData);
		displayResult(results);
		scanner.close();
	}
}