import java.util.Scanner;

public class MinMaxSearchByValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();

		for(int i = 0; i<cases; i++){
			String sequence = input.nextLine();
			Scanner seqScanner = new Scanner(sequence);

			int max = -100000;
			int min= 1000000;
			// -3 6 4 5
			while(seqScanner.hasNextInt()){
				int e = seqScanner.nextInt();
				
				if (e > max){
					max = e;
				}

				if (e <min){
					min = e;
				}
		}
		System.out.println(sequence);
		System.out.println(min);
		System.out.println(max);
		System.out.println();

	}
}
}