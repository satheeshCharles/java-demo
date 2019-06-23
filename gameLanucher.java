 class GuessGame{
	player p1;
	player p2;
	player p3;
	
	public void startGame() {
		p1=new player();
		p2=new player();
		p3=new player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
	int targetNumber = (int) (Math.random() *10);
	System.out.println (" I'm thinking of a number between 0 to 9" );
	
	while (true) {
		System.out.println(" Number to guess is " + targetNumber );
		
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.println("Player one Guessed" + guessp1);
		guessp2 = p2.number;
		System.out.println("Player one Guessed" + guessp2);
		guessp1 = p3.number;
		System.out.println("Player one Guessed" + guessp3);
		
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		if (guessp1 == targetNumber) {
			p2isRight = true;
		}
		if (guessp1 == targetNumber) {
			p3isRight = true;
		}
		
		if (p1isRight || p2isRight || p3isRight ) {
			System.out.println(" We have a Winner !");
			System.out.println ( " Player 1 got it right ? " + p1isRight );
			System.out.println ( " Player 1 got it right ? " + p2isRight );
			System.out.println ( " Player 1 got it right ? " + p3isRight );
			System.out.println (" Game is over " );
		} else {
			System.out.println ( " Player will have to try again " );
		}
	}
	}
}


 class player {
	
	int number =0 ; //where the guess goes
	
	public void guess () {
		number = (int) (Math.random() *10 );
		System.out.println(" I'm Guessing" +number );
	}
}

public class gameLauncher {
	public static void main(String [] args ){
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
		