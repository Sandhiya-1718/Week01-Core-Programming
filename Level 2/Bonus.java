import java.util.Scanner;
public class Bonus{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double salary[]=new double[10];
		int year[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the details of employee "+(i+1));
			while(true)
			{
				System.out.print("Enter the salary:");
				salary[i]=scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Enter the year of service:");
				year[i]=scanner.nextInt();
				scanner.nextLine();
				if(salary[i]>=0&&year[i]>=0)
					break;
				else
					System.out.println("Invalid number.Please enter a valid number.");
			}
		}
		scanner.close();
		double newSalary[]=new double[10];
		double bonus[]=new double[10];
		double totalBonus=0.0,totalNewSalary=0.0,totalOldSalary=0.0;
		for(int i=0;i<10;i++)
		{
			if(year[i]>=5)
				bonus[i]=salary[i]*0.05;
			else
				bonus[i]=salary[i]*0.02;
			newSalary[i]=salary[i]+bonus[i];
			totalBonus+=bonus[i];
			totalNewSalary+=newSalary[i];
			totalOldSalary+=salary[i];
		}
		for(int i=0;i<10;i++)
			System.out.println("Employee "+(i+1)+": OLD SALARY=Rs."+salary[i]+", BONUS=Rs."+bonus[i]+", NEW SALARY=Rs."+newSalary[i]);
		System.out.println("Total Old Salary:Rs."+totalOldSalary);
		System.out.println("Total Bonus:Rs."+totalBonus);
		System.out.println("Total New Salary:Rs."+totalNewSalary);
	}
}