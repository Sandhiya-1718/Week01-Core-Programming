import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		System.out.print(n+" students can give "+((n*(n-1))/2)+" handshakes");
	}
}