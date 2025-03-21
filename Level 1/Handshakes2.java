import java.util.Scanner;
public class Handshakes2{
	public static int Handshakes(int students)
	{
		int handshakes=((students*(students-1))/2);
		return handshakes;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int noOfHandshakes=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print(noOfHandshakes+" students can give "+Handshakes(noOfHandshakes)+" handshakes");
	}
}