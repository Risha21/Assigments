package ArrayConcept;

public class Assigment3 {

	public static void MinMaXIndexDifference(int numbers[]) {
		int min = numbers[0], max = numbers[0], minIndex = 0, maxIndex = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			} else {
				min = numbers[i];
				minIndex = i;
			}
		}

		System.out.println("Index of element holding maximum value is:" + maxIndex);
		System.out.println("Index of element holding minimum value is:" + minIndex);
		System.out.println(max - min);
	}

	public static void evenOddNumbers(int numbers[]) {
		System.out.print("[");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print("\"");
				System.out.print("even");

			} else {
				System.out.print("\"");
				System.out.print("odd");

			}
			System.out.print("\"");
			System.out.print(",");

		}
		System.out.print("]");

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		MinMaXIndexDifference(arr);
		evenOddNumbers(arr);
	}

}

/*
 * public static int printIndexOfMaxNum(int numbers[]) { int max = numbers[0],
 * min = numbers[0]; int indexMax = 0; for (int i = 0; i < numbers.length; i++)
 * { if (numbers[i] > max) { max = numbers[i]; indexMax = i; } } return
 * indexMax;
 * 
 * }
 * 
 * public static int printIndexOfMinNum(int numbers[]) { int max = numbers[0],
 * min = numbers[0]; int indexMin = 0; for (int i = 0; i < numbers.length; i++)
 * { if (numbers[i] < min) { min = numbers[i]; indexMin = i; } else if
 * (numbers[i] > max) { max = numbers[i];
 * 
 * } } return indexMin; }
 * 
 * 
 * public static int differenceMaxMinNumber(int numbers[]) { int max =
 * numbers[0], min = numbers[0]; for (int i = 1; i < numbers.length; i++) { if
 * (numbers[i] > max) { max = numbers[i]; } else if (numbers[i] < min) { min =
 * numbers[i]; }
 * 
 * } return max - min;
 * 
 * }
 * 
 * public static void evenOddNumbers(int numbers[]) {
 * 
 * for (int i = 0; i < numbers.length; i++) { if (numbers[i] % 2 == 0) {
 * System.out.print(" even ");
 * 
 * } else { System.out.print(" odd "); }
 * 
 * }
 * 
 * }
 * 
 * 
 */
