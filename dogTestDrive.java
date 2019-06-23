class dog {
	int size;
	String name;
	
	void bark(){
		if (size > 16) {
			System.out.println(" Bow Bow Bow ");
		}
		else if  ( size > 4 ) {
			System.out.println("Ke ke ke "); 
		}
		else {
			System.out.println("Yep Yep Yep");
		}
	}
}
	
class dogTestDrive {
	public static void main ( String args []) {
		
		dog t1= new dog();
		t1.size = 21;
		t1.bark();
		dog t2= new dog();
		t2.size = 5;
		t2.bark(3);
		dog t3= new dog();
		t3.size = 0;
		t1.bark();
	}
}