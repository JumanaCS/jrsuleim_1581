/* 
Problem 3: Logical Util
Jumana Suleiman
*/

public class LogicalUtil{
	public static boolean thereExists(boolean p, boolean q, boolean r){
		if(p == true || q == true || r == true){
			return true;
		}
		else{ 
			return false;
		}
	}

	public static boolean forAll(boolean p, boolean q, boolean r){
		if(p == true && q == true && r == true){
			return true;
		}
		else { 
			return false;
		}
	}

	public static boolean majority(boolean p, boolean q, boolean r){
		if(p == true && q == true || r == true){
			return true;
		}
		else { 
			return false;
		}
	}

	public static boolean minority(boolean p, boolean q, boolean r){
		if(p == false && q == false || r == false){
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean implies(boolean p, boolean q){
		if(p == true && q == false){
			return false;
		}
		else {
			return true;
		}
	}

	public static boolean implies(boolean p, boolean q, boolean r){
		if(p == true && q == true && r == false){
			return false;
		}
		else{
			return true;
		}
	}
}