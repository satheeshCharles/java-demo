class pusicat {
	String name = " Atlichi";
	int age = 5 ;
	
	void feel () {
		System.out.printf(" I Love Atlichi Cat ");
		System.out.println(age);
		System.out.println(name);
		
		//System.out.printf(" Pusicat "+" "age;" and " (name) );
	}
	}
	
	
public class pusiCatObject {
	public static void main ( String args[]) {
		pusicat pusi = new pusicat();
		pusi.age= 7;
		pusi.name = "Twitty";
		pusi.feel();
		
		pusicat pusi2 = new pusicat();
		pusi2.age=8;
		pusi2.name="atukutili";
		pusi2.feel();
		
		}
}

		

