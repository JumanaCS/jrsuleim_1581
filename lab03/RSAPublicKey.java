//problem 2
//Jumana Suleiman

import java.util.Scanner;

public class RSAPublicKey{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		//for each test case check the values entered are vaild for RSA public key or not
		while(cases-- > 0){
			long p = input.nextLong();
			long q = input.nextLong();
			long e = input.nextLong();
			long n = p*q;
			long totient = (p-1)*(q-1);

			//if either p or q is not prime then n is invalid
			if(!checkPrime(q) || !checkPrime(p)){
				System.out.println("Invalid n for RSA Key!");
				continue;
			}
			if(!(e>=1 && e<totient) || (n%e == 0)){
				System.out.println("Invalid e for RSA Key!");
				continue;
			}
			System.out.printf("RSA Public Key: n=%d e=%d%n", n , e);
		}
	}
	public static boolean checkPrime(long val){
		long number = val;
		int count = 0;

		for(int x = 1; x<= number; x++){
			if(number%x == 0){
				count++;
			}
			if(count >= 3) break;
		}
		return count == 2;
	}
}