import java.util.Scanner;
class TravelComputation {
   public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the city name:");
		String name=scanner.nextLine();
		System.out.print("Enter from city name:");
		String fromCity=scanner.nextLine();
		System.out.print("Enter via city name:");
		String viaCity=scanner.nextLine();
		System.out.print("Enter to city name:");
		String toCity=scanner.nextLine();
		System.out.print("Enter the distance from from city to via city:");
		double distanceFromToVia=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the distance from via city to final city:");
		double distanceViaToFinalCity=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the time take for from city to via city: ");
		int timeFromToVia=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the time take for via city to final city:");
		int timeViaToFinalCity=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		double totalDistance=distanceFromToVia+distanceViaToFinalCity;
		int totalTime=timeFromToVia+timeViaToFinalCity;
		System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totalDistance+" km and "+"the Total Time taken is "+totalTime+" minutes");
   }
}
