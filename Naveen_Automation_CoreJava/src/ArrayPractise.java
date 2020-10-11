
public class ArrayPractise {
	
	public  static int countOnes(int array[]) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				count=count+1;
				return count;
			}
			
		}
		return count;
		
	
	}
	
	
	public static void main(String[] args) {
		int array[]=new int[] {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0};
		//System.out.println(countOnes(array));
		ArrayPractise ap=new ArrayPractise();
		//ap.countOnes(array);
		System.out.println(ap.countOnes(array));
		
	}

}
