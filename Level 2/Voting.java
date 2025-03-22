public class Voting{
	public static int[] generateAges()
	{
		int ages[]=new int[10];
		for(int i=0;i<10;i++)
		{
			ages[i]=(int)(Math.random()*100);
			System.out.print(ages[i]+" ");
		}
		return ages;
	}
	public static String[][] checkVotingEligibility(int ages[])
	{
		String res[][]=new String[10][2];
		for(int i=0;i<10;i++)
		{
			res[i][0]=String.valueOf(ages[i]);
			res[i][1]=ages[i]>=18?"Can vote":"Cannot vote";
		}
		return res;
	}
	public static void displayResults(String results[][])
	{
		System.out.println("\n-----------------------");
		System.out.printf("%4s %15s","Age","Eligibility");
		System.out.println("\n-----------------------");
		for(int i=0;i<10;i++)
		{
			String age=results[i][0];
			String eligibility=results[i][1];
			System.out.printf("%4s %15s\n",age,eligibility);
		}
		System.out.println("\n-------------------------");
	}
	public static void main(String[] args)
	{
		System.out.print("Generated ages:");
		int ages[]=generateAges();
		String results[][]=checkVotingEligibility(ages);
		displayResults(results);
	}
}