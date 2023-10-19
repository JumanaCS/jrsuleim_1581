import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in);
		double fahrenheit = sc_object.nextDouble();
		double celsius = (fahrenheit - 32) * (5.0/9.0);
		System.out.println(celsius);
	}
}