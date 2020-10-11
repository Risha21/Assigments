
public class ArrayEvenOdd {
	public static void main(String[] args) {
	int array[]=new int[] {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 7,8,9,0, 0, 1, 1, 1, 1, 0, 0, 1, 0,0,0,0,0,2,3,0};
	
int count=0;int flag = 0;int sum=0 ;
System.out.println(array.length);

int len=array.length;
int store;


for(int i=0;i<len;i++) {
	
	store=array[i];
	sum = sum+array[i];
	
	if(array[i]==1 ) {
		count=count+1;
		}
	
	if(array[i]==0)
				flag=flag+1;
	}

if(count==flag) {
	System.out.println("return true ");
}

else {
	System.out.println("return false");
}
	
System.out.println("count of 0's are:"+flag);

	
System.out.println("count of 1's are:"+count);

System.out.println("sum of all the elements in array are:"+sum);
}
	
	
	
}
