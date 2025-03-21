import java.util.Scanner;
public class StudentVoteChecker{
	public static boolean canStudentVote(int age)
	{
		return age>=18;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int n=scanner.nextInt();
		scanner.nextLine();

		int age[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter age of student "+(i+1)+":");
			age[i]=scanner.nextInt();
			scanner.nextLine();
			while(age[i]<0)
			{
				System.out.print("Please enter age greater than 0:");
				age[i]=scanner.nextInt();
				scanner.nextLine();
			}
		}
		scanner.close();
		for(int i=0;i<n;i++)
			System.out.println("Student with age "+age[i]+(canStudentVote(age[i])?" can vote":" cannot vote"));
	}
}