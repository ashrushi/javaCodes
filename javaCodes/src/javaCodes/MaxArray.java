package javaCodes;

public class MaxArray {

	public static void main(String[] args) {
		
		int array[]= {2,15,4,1,8,3};
		
		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
			max=array[i];
			
		}

	}
System.out.println(max);
		
		
}
}