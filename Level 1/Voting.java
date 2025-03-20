import java.util.Scanner;
public class Voting{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int age[]=new int[10];
		for(int i=0;i<age.length;i++)
		{
			System.out.print("Enter student "+(i+1)+" age:");
			age[i]=scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		for(int i=0;i<age.length;i++)
		{
			if(age[i]>=18)
				System.out.println("The student with age "+age[i]+" can vote.");
			else
				System.out.println("The student with age "+age[i]+" cannot vote.");
		}
	}
}
			