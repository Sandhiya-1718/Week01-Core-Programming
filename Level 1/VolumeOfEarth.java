public class VolumeOfEarth{
	public static void main(String[] args){
		int radius=6378;
		double miles=radius*0.621371;
		double volumeKilometer=((double)4/3)*3.14*radius*radius*radius;
		double volumeMiles=((double)4/3)*3.14*miles*miles*miles;
		System.out.print("The volume of earth in cubic kilometers is "+volumeKilometer+" and cubic miles is "+volumeMiles);
	}
}