import java.util.Scanner;
public class YoungestTallest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Amar age:");
		int amarAge=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Akbar age:");
		int akbarAge=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Anthony age:");
		int anthonyAge=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Amar age:");
		int amarheight=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Akbar age:");
		int akbarheight=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Anthony age:");
		int anthonyheight=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		if(amarAge<akbarAge&&amarAge<anthonyAge)
			System.out.println("Amar is the youngest");
		else if(akbarAge<amarAge&&akbarAge<anthonyAge)
			System.out.println("Akbar is the youngest");
		else
			System.out.println("Anthony is the youngest");
		if(amarheight>akbarheight&amarheight>anthonyheight)
			System.out.println("Amar is the tallest");
		else if(akbarheight>amarheight&&akbarheight>anthonyheight)
			System.out.println("Akbar is the tallest");
		else
			System.out.println("Anthony is the tallest");
	}
}
		