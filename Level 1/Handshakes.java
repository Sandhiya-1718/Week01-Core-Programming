import java.util.Scanner;
public class Handshakes{
	public static int noOfHandshakes(int students)
	{
		int handshakes=((students*(students-1))/2);
		return handshakes;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print(n+" students can give "+noOfHandshakes(n)+" handshakes");
	}
}