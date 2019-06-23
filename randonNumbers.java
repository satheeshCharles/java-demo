public class randonNumbers {
	public static void main (String[] args) 
	{ 
	String[] wordList1 = {"Hey","Hello","Yo" };
	String[] wordList2 = {"Whats'up","How you Doing","Well"};
	String[] wordList3 = {"Cool?", "Dude","buddy"};
	
	int length1 = wordList1.length;
	int length2 = wordList2.length;
	int length3 = wordList3.length;
	System.out.println(length1);
	int count1 = (int)  (Math.random()*length1);
	int count2 = (int)  (Math.random()*length2);
	int count3 = (int)  (Math.random()*length3);
	
	System.out.println(count1);

	String output = wordList1[count1] + " " + wordList1[count2] + " " + wordList1[count3];
	System.out.println(output);
	
	}
}
