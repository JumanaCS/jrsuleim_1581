public class ArrayUtil{
	//Problem 1
	public static void reverse(String[] array){
		for(int i = 0; i < array.length / 2; i++){
			String temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i - 1] = temp;
		}
	}

	//Probelm 2
	public static String[] resize(String[] array){
		String[] e = new String[array.length * 2];

		for(int i = 0; i < array.length; i++){
			e[i] = array[i];
		}
		return e;
	}


	//Problem 5
	public static int findMinValue(int[] array){
		int min = array[0];
		for(int element : array){
			if(element < min){
				min = element;
			}
		}
		return min;
	}

	public static int findMaxValue(int[] array){
		int max = array[0];
		for(int element : array){
			max = Math.max(max, element);
		}
		return max;
	}

	//problem 6
	public static int[] findMinIndex(int[] array){
		int min = findMinValue(array);
		int count = 0;

		for(int element : array){
			if(element == min){
				count++;
			}
		}

		int[] indices = new int[count];
		int indexCount = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == min){
				indices[indexCount++] = i;
			}
		}

		return indices;
	}

	public static int[] findMaxIndex(int[] array){
		int max = findMaxValue(array);
		int count = 0;

		for(int element : array){
			if(element == max){
				count++;
			}
		}

		int[] indices = new int[count];
		int indexCount = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == max){
				indices[indexCount++] = i;
			}
		}
		return indices;
	}	
}