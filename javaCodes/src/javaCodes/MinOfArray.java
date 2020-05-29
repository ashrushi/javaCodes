package javaCodes;

public class MinOfArray {

	public static void main(String[] args) {
		int a[]= {5,2,1,0,7,4};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				
				min=a[i];
			}
		}
    System.out.println(min);
	}

}
