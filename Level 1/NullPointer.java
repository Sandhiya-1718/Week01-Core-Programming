public class NullPointer{
	public static void generateException()
	{
		String text=null;
		System.out.println(text.length());
	}
	public static void handleException()
	{
		String text=null;
		try
		{
			System.out.println(text.length());
		}
		catch(Exception e)
		{
			System.out.println("NullPointerException found");
		}
	}
	public static void main(String[] args)
	{
		handleException();
		generateException();
	}
}
