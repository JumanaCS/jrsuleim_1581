import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//the sequence in fibonacci is each number in it is the sum of the previous 2 numbers
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0, 0);
		fib.add(1, 1);
		int cases = input.nextInt();

		for(int e =0; e<cases; e++){
			int pos = input.nextInt();

			for(int i = 2; i <= pos; i++){
				fib.add(i, fib.get(i-1)+fib.get(i-2)); 
			}

			System.out.println(fib.get(pos));
		}

	}
}