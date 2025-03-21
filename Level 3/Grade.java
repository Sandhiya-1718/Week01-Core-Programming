import java.util.Scanner;
public class Grade{
	public static int[][] generateMarks(int students)
	{
		int marks[][]=new int[students][3];
		for(int i=0;i<students;i++)
		{
			marks[i][0]=10+(int)(Math.random()*100);
			marks[i][1]=10+(int)(Math.random()*100);
			marks[i][2]=10+(int)(Math.random()*100);
		}
		return marks;
	}
	public static double[][] results(int marks[][])
	{
		double results[][]=new double[marks.length][3];
		for(int i=0;i<marks.length;i++)
		{
			int total=marks[i][0]+marks[i][1]+marks[i][2];
			double average=total/3.0;
			double percentage=(total/300.0)*100;
			results[i][0]=total;
			results[i][1]=Math.round(average*100.0)/100.0;
            results[i][2]=Math.round(percentage*100.0)/100.0; 
		}
		return results;
	}
	public static void displayScoreCard(int[][] marks, double[][] results)
	{
		System.out.println("\n---------------------------------------------------------------------");
		System.out.print("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
		System.out.println("\n---------------------------------------------------------------------");
		for (int i = 0; i < marks.length; i++) 
			System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n",(i+1),marks[i][0],marks[i][1],marks[i][2],(int)results[i][0],results[i][1],results[i][2]);
		System.out.println("---------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
		scanner.nextLine();
        scanner.close();
        int marks[][]=generateMarks(numStudents);
        double results[][]=results(marks);
        displayScoreCard(marks,results);
    }
}