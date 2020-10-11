package ArrayConcept;

 class Arrays {

	public static int countOnes(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int countZeros(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public boolean compareZerosOnes(int numbers[]) {
		if (countOnes(numbers) == countZeros(numbers)) {
			return true;

		}
		return false;

	}

	public double sumOfArray(int numbers[]) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;

	}

	public static void main(String[] args) {

		int array[] = new int[] { 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 2, 3, 4, 5, 7, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1,
				0 };

		System.out.println(countOnes(array));
		System.out.println(countZeros(array));
		Arrays ar = new Arrays();
		System.out.println(ar.compareZerosOnes(array));
		System.out.println(ar.sumOfArray(array));

	}

		
	}


