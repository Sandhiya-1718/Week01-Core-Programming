import java.util.Scanner;
public class TwoDArray{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of rows:");
		int rows=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the no.of columns:");
		int cols=scanner.nextInt();
		scanner.nextLine();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Element ["+i+"]["+j+"]:");
				matrix[i][j]=scanner.nextInt();
				scanner.nextLine();
			}
		}
		scanner.close();
		System.out.println("2 Dimensional Array:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int ar[]=new int[rows*cols];
		int index=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				ar[index]=matrix[i][j];
				index++;
			}
		}
		System.out.print("1 Dimensional array:");
		for(int i=0;i<index;i++)
			System.out.print(ar[i]+" ");
	}
}