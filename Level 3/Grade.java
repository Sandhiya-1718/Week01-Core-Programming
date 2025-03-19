import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the physics mark:");
		int physics=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the chemistry mark:");
		int chemistry=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the maths mark:");
		int maths=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		int percent=(physics+chemistry+maths)/3;
		System.out.println("Average:"+percent);
		if(percent>=80)
		{
			System.out.println("Grade  :A");
			System.out.print("Remarks:Level 4, above agency-normalized standards");
		}
		else if(percent>=70&&percent<80)
		{
			System.out.println("Grade  :B");
			System.out.print("Remarks:Level 3, at agency-normalized standards");
		}
		else if(percent>=60&&percent<70)
		{
			System.out.println("Grade  :C");
			System.out.print("Remarks:Level 2,below, but approaching agency-normalized standards");
		}
		else if(percent>=50&&percent<60)
		{
			System.out.println("Grade  :D");
			System.out.print("Remarks:Level 1,well below agency-normalized standards");
		}
		else if(percent>=40&&percent<50)
		{
			System.out.println("Grade  :E");
			System.out.print("Remarks:Level 1-,too below agency-normalized standards");
		}
		else
		{
			System.out.println("Grade  :R");
			System.out.print("Remarks:Remedial standards");
		}
	}
}