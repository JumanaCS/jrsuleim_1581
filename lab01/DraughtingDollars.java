import java.util.Scanner;

public class DraughtingDollars{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double percOfBeerInKeg = sc.nextDouble(); // 0.7
		double priceOfServing = sc.nextDouble(); // 1.95

		double fullKegInGallons = 15.5;
		double gallonToOunces = 128;
		double pintOunces = 16;

		double totalPintsInFullKeg = (fullKegInGallons * gallonToOunces )/ pintOunces;
	
		double remainingPints = totalPintsInFullKeg * percOfBeerInKeg;
		
		double totalAmount = (int)remainingPints *priceOfServing;


		System.out.printf("There is $%.2f of beer left in keg%n", totalAmount); 
		 
	}
}
