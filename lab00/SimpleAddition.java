import java.util.Scanner;

public class SimpleAddition{
	public static void main(String[] args){
	//declaration of results variable as integer type.
	int result;
	// create a scanner object of name inputScanner to read unput.
	Scanner inputScanner = new Scanner(System.in);
	// reads input, treat it as an integer value and saves it in x and y variables.
	int x = inputScanner.nextInt();
	int y = inputScanner.nextInt();
	// add x and y ; save it in another varaible result.
	result = x + y;
	//print the vault stoed in the result variable.
	System.out.println(result); 
    }  
}