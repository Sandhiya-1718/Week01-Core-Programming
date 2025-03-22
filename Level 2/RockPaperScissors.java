import java.util.Scanner;
public class RockPaperScissors{
	public static String getComputerChoice()
	{
		String choices[]={"Rock","Paper","Scissors"};
		int index=(int)(Math.random()*3);
		return choices[index];
	}
	public static String determineWinner(String userChoice,String computerChoice)
	{
		if(userChoice.equalsIgnoreCase(computerChoice))
			return "Draw";
		else if((userChoice.equalsIgnoreCase("Rock")&&userChoice.equalsIgnoreCase("Scissors"))||(userChoice.equalsIgnoreCase("Scissors")&&userChoice.equalsIgnoreCase("Paper"))||(userChoice.equalsIgnoreCase("Paper")&&userChoice.equalsIgnoreCase("Rock")))
			return "User";
		else
			return "Computer";
	}
	public static void displayResults(int userWins,int computerWins,int totalGames)
	{
		System.out.println("The games shows that");
		System.out.println("------------------------------------------");
		System.out.printf("%10s %15s %10s\n","User Wins","Computer Wins","Draws");
		System.out.println("------------------------------------------");
		System.out.printf("%10d %15d %10d\n",userWins,computerWins,totalGames-(userWins+computerWins));
		System.out.println("------------------------------------------");
		double userWinPercent=(userWins*100.0)/totalGames;
		double computerWinPercent=(computerWins*100.0)/totalGames;
		System.out.printf("User Win Percentage:%.2f\n",userWinPercent);
		System.out.printf("Computer Win Percentage:%.2f\n",computerWinPercent);
		}
	public static void main(String[] args)
	{
		int userWins=0,computerWins=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the total no.of games you like to play:");
		int totalGames=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<totalGames;i++)
		{
			System.out.print("Enter Rock,Paper or Scissors:");
			String userChoice=scanner.nextLine();
			String computerChoice=getComputerChoice();
			System.out.println("Computer choose:"+computerChoice);
			String winner=determineWinner(userChoice,computerChoice);
			if(winner.equals("User"))
			{
				userWins++;
				System.out.println("You Win.!!");
			}
			else if(winner.equals("Computer"))
			{
				computerWins++;
				System.out.println("Computer Win.!!");
			}
			else
				System.out.println("It's a Draw.!!");
		}
		System.out.println();
		displayResults(userWins,computerWins,totalGames);
		scanner.close();
	}
}