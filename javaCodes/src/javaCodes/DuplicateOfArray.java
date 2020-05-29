package javaCodes;

public class DuplicateOfArray {

	public static void main(String[] args) {
		
		int a[]= {7,5,6,7,11,4,2};
		
		int dup=a[0];
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					dup=a[i];
					
				}
				
			}
			
		}
		
		System.out.println(dup);

	}

}
