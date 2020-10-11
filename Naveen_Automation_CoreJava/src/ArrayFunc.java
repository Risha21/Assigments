
public class ArrayFunc {
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	public static void count1() {
		int array[]=new int[] {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0};
		
		int count=0;;boolean b;
		System.out.println(array.length);

		int len=array.length;
		int store;

		for(int i=0;i<len;i++) {
			
			store=array[i];
			if(array[i]==1 ) {
				count=count+1;
				}
			
			else 
						flag=flag+1;
			}
}
	
	public static void equal() {
		int flag = 0
		if(count==flag) {
			System.out.println("return true");
		}

		else {
			System.out.println("return false");
		}
		
	}
	}