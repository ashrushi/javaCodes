package javaCodes;

 abstract class Vehicle {
	public abstract int getnoofwheels();
	
	}
 class Bus extends A{
	public int getnoofwheels() {
		 return 6;
	 }
}
 class A{
	 public static void main(String []args) {
		 Bus b=new Bus();
		 b.getnoofwheels();
		 System.out.println(b);
	 }
 }