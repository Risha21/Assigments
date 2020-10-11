package ArrayConcept;

import java.util.HashMap;

public class Assigment3 {

	public static int printIndexOfMaxNum(int numbers[]) {
		int max = numbers[0], min = numbers[0];
		int indexMax = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				indexMax = i;
			} else if (numbers[i] < min) {
				min = numbers[i];

			}
		}
		return indexMax;

	}

	public static int printIndexOfMinNum(int numbers[]) {
		int max = numbers[0], min = numbers[0];
		int indexMin = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				indexMin = i;
			} else if (numbers[i] > max) {
				max = numbers[i];

			}
		}
		return indexMin;

	}

	public static int differenceMaxMinNumber(int numbers[]) {
		int max = numbers[0], min = numbers[0];
		int difference = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				System.out.println(i);
			} else if (numbers[i] < min) {
				min = numbers[i];
			}

			difference = max - min;

		}
		return difference;

	}

	public static void evenOddNumbers(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(" even ");

			} else {
				System.out.print(" odd ");
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		System.out.println("Index of an integer holding maximum value is:"+printIndexOfMaxNum(arr));
		System.out.println("Index of an integer holding maximum value is:"+printIndexOfMinNum(arr));
		System.out.println("Difference between maximum and minimum value in an array is:" + differenceMaxMinNumber(arr));
		evenOddNumbers(arr);
		

	}

}
/*
 * System.out.println("number of elements available in array are:"+arr.length);
 * /*for(int i=0;i<arr.length;i++) { if(arr[i]%2==0) {
 * System.out.print(" even "); } else { System.out.print(" odd "); }
 */
/*
 * int min=arr[0]; System.out.println(min); for(int i=1;i<arr.length;i++) {
 * if(arr[i]<min) { min=arr[i]; System.out.println(min); } } //
 * System.out.print(arr[i]); // HashMap<Integer,Integer> hm=new
 * HashMap<Integer,Integer>;
 * 
 * 
 * }
 */
/*
 * public static int maxInteger(int numbers[]) { int max=numbers[0]; for(int
 * i=1;i<numbers.length;i++) { if(numbers[i]>max) { max=numbers[i]; } }
 * 
 * return max; }
 * 
 * public static int minInt(int numbers[]) { int min=numbers[0]; for(int
 * i=1;i<numbers.length;i++) { if(numbers[i]<min) { min=numbers[i]; } } return
 * min;
 * 
 * }
 * 
 * /*public void differenceMaxMin() {
 * 
 * System.out.println(max); System.out.println(min); // int difference=max-min;
 * // return difference; return max;
 * 
 * 
 * }
 */
