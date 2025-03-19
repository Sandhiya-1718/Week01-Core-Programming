import java.util.Scanner;
public class BmiCalculation{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your weight in kgs:");
		double weight=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter your height in cm:");
		double height=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		double heightm=height*0.01;
		double bmi=weight/(heightm*heightm);
		if(bmi<=18.4)
			System.out.print("Underweight");
		else if(bmi>18.5&&bmi<=24.9)
			System.out.print("Normal");
		else if(bmi>25.0&&bmi<=39.9)
			System.out.print("Overweight");
		else 
			System.out.print("Obese");	
	}
}