import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		for(int i=1;i<=n;i++)
			if(i%2==0)
				System.out.println(i+" is Even");
			else
				System.out.println(i+" is Odd");
	}
}