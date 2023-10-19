/* 
ASMEmulator
Jumana Suleiman
*/

public class ASMEmulator{
	private static int eax = 0;
	private static int ebx = 0;
	private static int ecx = 0;
	private static int edx = 0;

	public static void mov(String reg1, int val){
		switch(reg1){
			case "eax" : eax = val;
			break;
			case "ebx" : ebx = val;
			break;
			case "ecx" : ecx = val;
			break;
			case "edx" : edx = val;
			break;
		}
	}

	public static void mov(String reg1, String reg2){
		int value = 0;
		switch(reg2){
			case "eax": value = eax; break;
			case "ebx": value = ebx; break;
			case "ecx": value = ecx; break;
			case "edx": value = edx; break;
		}
		mov(reg1, value);
	}

	public static void add(String reg1, int val){
		switch(reg1){
			case "eax": eax = eax + val; break;
			case "ebx": eax = ebx + val; break; 
			case "ecx": eax = ecx + val; break;
			case "edx": eax = edx + val; break; 
		}
	}

	public static void add(String reg1, String reg2){
		int value = 0;
		switch(reg2){
			case "eax": value = eax; break;
			case "ebx": value = ebx; break;
			case "ecx": value = ecx; break;
			case "edx": value = edx; break;
		}
		add(reg1, value);
	}

	public static void imul(String reg1, int val){
		switch(reg1){
			case "eax": eax = eax * val; break;
			case "ebx": eax = ebx * val; break;
			case "ecx": eax = ecx * val; break;
			case "edx": eax = edx * val; break;
		}
	}

	public static void imul(String reg1, String reg2){
		int value = 0;
		switch(reg2){
			case "eax": value = eax; break;
			case "ebx": value = ebx; break;
			case "ecx": value = ecx; break;
			case "edx": value = edx; break;
		}
		imul(reg1, value);
	}

	public static void cmp(String reg1, int val){
		switch(reg1){
			case "eax": eax = (eax == val) ? 1 : 0; break;
			case "ebx": eax = (ebx == val) ? 1 : 0; break;
			case "ecx": eax = (ecx == val) ? 1 : 0; break;
			case "edx": eax = (edx == val) ? 1 : 0; break;
		}
	}

	public static void cmp(String reg1, String reg2){
		int value = 0;
		switch(reg2){
			case "eax": value = eax; break;
			case "ebx": value = ebx; break;
			case "ecx": value = ecx; break;
			case "edx": value = edx; break;
		}
		cmp(reg1, value);
	}

	public static void call(String proc, String reg1){
		if(proc.equals("PRINT")){
			switch(reg1){
				case "eax": System.out.println("[eax]: " + eax); break;
				case "ebx": System.out.println("[ebx]: " + ebx); break;
				case "ecx": System.out.println("[ecx]: " + ecx); break;
				case "edx": System.out.println("[edx]: " + edx); break;
			}
		}
	}
}