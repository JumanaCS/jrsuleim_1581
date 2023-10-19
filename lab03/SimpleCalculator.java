//problem 7
//Jumana Suleiman 

import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);
	int cases = inputScanner.nextInt();
	inputScanner.nextLine(); 

	for(int i =0; i<cases; i++){
		String seq = inputScanner.nextLine();
		Scanner seqReader = new Scanner(seq);

		int numb1 = seqReader.nextInt();//the first number in seq
		String e = seqReader.next();//the string in the middle
		int numb2 = seqReader.nextInt();//second number in seq
		if(e.equals("+")){
			System.out.println(addition(numb1, numb2));
		}
		else if(e.equals("-")){
			System.out.println(subtraction(numb1, numb2));			
		}
		else if(e.equals("*")){
			System.out.println(multiplication(numb1, numb2));
		}
		else if(e.equals("/")){
			System.out.println(division(numb1, numb2));
		}
		else if(e.equals("%")){
			System.out.println(modulus(numb1, numb2));
		}
		else if(e.equals("**")){
			System.out.println(exponentiation(numb1, numb2));
		}
		}
    }
      
    public static int addition(int num1, int num2){
		int result = num1 + num2;

		return result;
    }

    public static int subtraction(int num1, int num2){
		int result = num1 - num2;

		return result;
    }

    public static int multiplication(int num1, int num2){
		int result = num1 * num2;

		return result;
    }

    public static int division(int num1, int num2){
		int result = num1 / num2;

		return result;
    }

    public static int modulus(int num1, int num2){
		int result = num1 % num2;

		return result;
    }

    public static int exponentiation(int num1, int num2){
		int result = 1;
		int counter = 1;

		while(counter <= num2){
			result = result * num1;
			counter++;
		}

		return result;
    }
}
