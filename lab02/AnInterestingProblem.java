import java.util.Scanner;

public class AnInterestingProblem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int cases = input.nextInt();
	input.nextLine();
	int numOfYears = 0;

	for(int i =0; i<cases; i++){

		// read test case from input: 1000 10
		String testCase = input.nextLine();
		// create a scanner to parse the test case string
		Scanner seq = new Scanner(testCase);
		// takes the first double in the test case line: 100
		double deposit = seq.nextDouble();
		// takes the second double from the test case: 10
		double interest = seq.nextDouble();

		interest /= 100;

		// we loop to multiply the interest and add to the total until the total is at least 1000000
		for(double e =deposit; e<1000000; e+=(e*interest)){
			numOfYears++;
		}
		System.out.println(numOfYears + " years");
		numOfYears = 0;
	}
	}
}

// first year
// 10 + 50%= 15

// 15 + 50% = 22.50