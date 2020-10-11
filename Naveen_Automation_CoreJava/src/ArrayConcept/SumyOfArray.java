package ArrayConcept;

public class SumyOfArray {

	public static void traverseArray(int numbers[]) {
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("elements of array are:"+numbers);
		}
	}
	public int calculateSum(int total[]) {
		int sum=0;
		for(int i=0;i<total.length;i++) {
			sum=sum+total[i];
			}
	return sum;
	
	}
	
	public static void main(String[] args) {
		int ar[]=new int[] {1,2,3,4,5,6,7};
		traverseArray(ar);
		SumyOfArray soa=new SumyOfArray();
		System.out.println(soa.calculateSum(ar));
	
		}
	}

	