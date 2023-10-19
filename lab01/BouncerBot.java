import java.util.Scanner;

public class BouncerBot{
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in);
		//First 3 inputs as current month, day and year
		int thisMonth = sc_object.nextInt();
		int thisDay = sc_object.nextInt();
		int thisYear = sc_object.nextInt();

		//remaining 3 inputs as birth month, day and year
		int birthMonth = sc_object.nextInt();
		int birthDay = sc_object.nextInt();
		int birthYear = sc_object.nextInt();

		boolean isBday = (thisDay == birthDay) && (thisMonth == birthMonth); //true && true -> isBday = true 
		boolean isOver21 = (thisYear-birthYear) >= 21; //2018-1990=28 -> isOver21 = true 
		boolean canEnter = isBday && isOver21; //canEnter = true && true => true
		System.out.println(canEnter);

	}
}
