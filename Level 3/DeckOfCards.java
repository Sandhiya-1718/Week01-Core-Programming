import java.util.Scanner;
public class DeckOfCards
{
    public static String[] initializeDeck()
	{
        String suits[]={"Hearts","Diamonds","Clubs","Spades"};
        String ranks[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards=suits.length*ranks.length;
        String deck[]=new String[numOfCards];
        int index=0;
        for(int i=0;i<suits.length;i++)
		{
            for(int j=0;j<ranks.length;j++)
			{
                deck[index]=ranks[j]+" of "+suits[i];
				index++;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String deck[])
	{
        for(int i=0;i<deck.length;i++)
		{
            int randomCardNumber=i+(int)(Math.random()*(deck.length-i));
            String temp =deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
    }
    public static String[][] distributeCards(String[] deck,int numPlayers,int numCards)
	{
        if(numPlayers*numCards>deck.length) 
		{
            System.out.println("Not enough cards for distribution!");
            return null;
        }
        String players[][]=new String[numPlayers][numCards];
        int index=0;
        for(int i=0;i< numCards;i++) {
            for(int j=0;j<numPlayers;j++)
			{
                players[j][i]=deck[index];
				index++;
            }
        }
        return players;
    }
    public static void printPlayersCards(String players[][])
	{
        if(players==null)
			return;
        for(int i=0;i<players.length;i++)
		{
            System.out.println("Player "+(i+1)+"'s cards:");
            for(int j=0;j<players[i].length;j++)
                System.out.println(players[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of players:");
        int numPlayers=scanner.nextInt();
        System.out.print("Enter number of cards per player:");
        int numCards=scanner.nextInt();
        scanner.close();
        String deck[]=initializeDeck();
        shuffleDeck(deck);
        String players[][]=distributeCards(deck,numPlayers,numCards);
		if(players!=null)
            printPlayersCards(players);
    }
}