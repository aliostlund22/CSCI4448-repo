public class Main {


	public static void main(String args[]){

		// Simulation store
		// We only need one store so were using a singleton pattern here
		Store BoulderHardware = Store.getInstance();

		// Run through 35 days of simulation
		for(int i=1; i<=35; i++){
			System.out.println("---------------------Current Day: "+ i + " -----------------------------");
			BoulderHardware.daySimulation();
			System.out.println("---------------------End of day " + i + " ----------------------------\n");
		}

		// Create a report at the end of the season
		System.out.println("-----------------------End of season report------------------------");
		System.out.println(BoulderHardware.completedRentalToString());
		System.out.println(BoulderHardware.activeRentalToString() );
		System.out.println("The total money our store made today: $" + BoulderHardware.getProfit());
	}


}
