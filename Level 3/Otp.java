public class Otp{
	public static boolean unique(int otp[])
	{
		for(int i=0;i<otp.length;i++)
		{
			for(int j=i+1;j<otp.length;j++)
			{
				if(otp[i]==otp[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		int otp[]=new int[10];
		System.out.print("The generated otps are:");
		for(int i=0;i<10;i++)
		{
			otp[i]=100000+(int)(Math.random()*(900000));
			System.out.print(otp[i]+" ");
		}
		System.out.println();
		System.out.print("Unique? "+unique(otp));
	}
}