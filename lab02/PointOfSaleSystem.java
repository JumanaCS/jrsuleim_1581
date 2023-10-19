import java.util.Scanner;

public class PointOfSaleSystem{
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in);
		
		// get number of cases
		int cases = sc_object.nextInt();
		sc_object.nextLine();


		for(int i =0; i<cases; i++){

			// test case
			// ex: 1 4 5 6 7
			String sequence = sc_object.nextLine();
			double total_price = 0.0;

			//scanner to read the test case numbers one at a time
			Scanner seqReader = new Scanner(sequence);

			// while there is an integer in the line of test case
			while(seqReader.hasNextInt()){
				// take that choice integer
				int choice = seqReader.nextInt();

				switch(choice){
					case 1: total_price += 1.50; break;
					case 2: total_price += 1.75; break;
					case 3: total_price += 2.50; break;
					case 4: total_price += 2.75; break;
					case 5: total_price += 0.99; break;
					case 6: total_price += 1.25; break;
				}
			}
			total_price *= 1.065; //tax 
			System.out.printf("Please pay $%.2f%nThank you for eating at McDowell's!%n",total_price);
		}
	}
}