public class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
	int targetNumber = (int) (Math.random() *10);
	System.out.println (" I'm thinking of a number between 0 to 9 );
	
	while (true) {
		System.out.println(" Number to guess is " + targetNumber );
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.Println("Player one Guessed" + guessp1);
		guessp2 = p2.number;
		System.out.Println("Player one Guessed" + guessp2);
		guessp1 = p3.number;
		System.out.Println("Player one Guessed" + guessp3);
		
		if guessp1 == targetNumber {
			p1isRight = true;
		}
		if guessp1 == targetNumber {
			p2isRight = true;
		}
		if guessp1 == targetNumber {
			p3isRight = true;
		}
		
		if (p1isRight || p2isRight || p3isRight ) {
			System.out.Println(" We have a Winner !")
			System.out.Println ( " Player 1 got it right ? " + p1isRight );
			System.out.Println ( " Player 1 got it right ? " + p2isRight );
			System.out.Println ( " Player 1 got it right ? " + p3isRight );
			System.out.println (" Game is over " );
		} else {
			System.out.println ( " Player will have to try again " );
		}
	}
	}
}


Public class player {
	
	int number =0 ; //where the guess goes
	
	public void guess () {
		number = (int) (Math.random() *10 );
		System.out.println(" I'm Guessing" +number );
	}
}