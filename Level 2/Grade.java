import java.util.Scanner;
public class Grade{
	public static int[][] getMarks(int n)
	{
		int marks[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
				marks[i][j]=10+(int)(Math.random()*90);
		}
		return marks;
	}
	public static double[][] calculateResult(int marks[][])
	{
		double results[][]=new double[marks.length][3];
		for(int i=0;i<marks.length;i++)
		{
			results[i][0]=marks[i][0]+marks[i][1]+marks[i][2];
			results[i][1]=Math.round((results[i][0]/3.0)*100.0)/100.0;
			results[i][2]=Math.round((results[i][0]/300.0*100)*100.0)/100.0;
		}
		return results;
	}
	public static String[] calculateGrade(double results[][])
	{
		String grades[]=new String[results.length];
		for(int i=0;i<results.length;i++)
		{
			double percentage=results[i][2];
			if(percentage>=80)
				grades[i]="A";
			else if(percentage>=70)
				grades[i]="B";
			else if(percentage>=60)
				grades[i]="C";
			else if(percentage>=50)
				grades[i]="D";
			else if(percentage>=40)
				grades[i]="E";
			else 
				grades[i]="R";
		}
		return grades;
	}
	public static void displayScorecard(int marks[][],double results[][],String grades[])
	{
		System.out.println("-------------------------------------------------------------------------------");
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n","Student","Physics","Chemistry","Maths","Total","Average","Percent","Grade");
		System.out.println("\n-------------------------------------------------------------------------------");
		for(int i=0;i<marks.length;i++)
			System.out.printf("%10d %10d %10d %10d %10.2f %10.2f %10s\n",(i+1),marks[i][0],marks[i][1],marks[i][2],results[i][0],results[i][1],results[i][2],grades[i]);
		System.out.println("\n-------------------------------------------------------------------------------");
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int students=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int marks[][]=getMarks(students);
		double results[][]=calculateResult(marks);
		String grades[]=calculateGrade(results);
		displayScorecard(marks,results,grades);
	}
}
			