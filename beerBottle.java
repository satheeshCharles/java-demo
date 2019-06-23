public class beerBottle {
	public static void main (String args[])
	{
		int beerCount = 99;
		String word="bottles";
		
		while( beerCount > 0 ) {
			if (beerCount ==1) {
				word = "bottle";
			    System.out.println(" Here is your " +beerCount+ word);
			}
			beerCount = beerCount -1 ;
			if (beerCount > 0 ) {
				System.out.println ( " Here is your " +beerCount+ word);
			}
			else {
				System.out.println(" No More Bottles" );
			}
			
		}
	}
}	