import java.util.Scanner;
public class NumberGuessingGame {
	private static int generateGuess(int low,int high)
	{
		return low+(int)(Math.random()*(high-low+1));
    }
	private static boolean processFeedback(String feedback)
	{
		return feedback.equals("correct");
    }
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int low=1,high=100;
        boolean guessedCorrectly=false;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
		System.out.println("Respond with 'high' if my guess is too high,'low' if it's too low,and 'correct' if I got it right.");
		while (!guessedCorrectly)
		{
			int guess=generateGuess(low,high);
			System.out.print("Is your number "+guess+"?");
            String feedback=scanner.next();
            guessedCorrectly=processFeedback(feedback);
            if(feedback.equalsIgnoreCase("low"))
                low=guess+1;
            else if(feedback.equalsIgnoreCase("high"))
                high=guess-1;
            else if(!feedback.equalsIgnoreCase("correct"))
                System.out.println("Invalid input! Please respond with 'high', 'low', or 'correct'.");
        }
        System.out.println("Yay! I guessed your number.");
        scanner.close();
    }
}
