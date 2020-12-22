package practice_Java;

public class DataTypes {
	
	int m;
	int n;
	
	public static void main(String[] arg) {
		
		DataTypes d = new DataTypes();
		
		int x = 50;
		int y = 60;
		d.sum(x, y); // call by value or pass by value
		
		d.m=50;
		d.n=60;
		
		d.swap(d);
		
		System.out.println(d.m);
		System.out.println(d.n);
		
	}
	
	public int sum(int a, int b) {
		int c = a+b;
		
		return c;
	}
	// call by reference
	public void swap(DataTypes t) {
		int temp;
		temp = t.n;
		t.n = t.m;
		t.m = temp;
	}
}