package OOPConceptPart1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		obj.testSum(x, y); // Call by value OR pass by value

		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		//After swap
		System.out.println(obj.q);
		System.out.println(obj.p);
	}
	
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	// Call by reference or Pass by reference - possible in Java as no pointer in Java
	public void swap(CallByValueAndCallByReference t) { // value of obj will be given to t, object is referred by obj & t
		int temp; 
		temp=t.p; // temp=50		=swapping values
		t.p=t.q; // t.p=60
		t.q=temp; // t.q=50
	}

}
