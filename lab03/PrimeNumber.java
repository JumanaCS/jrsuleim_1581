import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		for(int i = 0; i < cases; i++){
			int choice = input.nextInt();
			int count = 0;

			for(int x = 1; x<= choice; x++){
				if(choice%x == 0){
					count++;
				}
				if(count >= 3) break;
			}

			Boolean isPrime = count == 2;
			System.out.println(isPrime);
		}
	}
}