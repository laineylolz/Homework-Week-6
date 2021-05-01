
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//3. Instantiate a Deck and two Players, call the shuffle method on the deck:
		 
		Deck deck = new Deck();
		
	        Player player1 = new Player("Delainey", 0);
	        Player player2 = new Player("Jean-Paul", 0);
	        deck.shuffle();
	
//4. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated:
	      
	        for (int i = 0; i < 52; i++) {
	            if(i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }
	        
//5. Using a traditional for loop, iterate 26 times and call the flip method for each player:
	
	        for (int i = 0; i < 26; i++) {

				Card player1Card = player1.flip();
				Card player2Card = player2.flip();
				
			System.out.println();
			System.out.println(player1.getName() + " drew the card:");
	        player1Card.describe();
	        System.out.println();
	        System.out.println(player2.getName() + " drew the card:");
	        player2Card.describe();
				
//a. Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value:			
				
				if (player1Card.getValue() == player2Card.getValue()) {
					System.out.println();
					System.out.println("******************");
					System.out.println("****** WAR! ******");
					System.out.println("******************");
					continue;
					
				} else if (player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
					System.out.println();
					System.out.println("**The point goes to " + player1.getName() + " : " + player1.getScore());
					
				} else {
					player2.incrementScore();
					System.out.println();
					System.out.println("**The point goes to " + player2.getName() + " : " + player2.getScore());
				}
			}
	        
	        
//6.	After the loop, compare the final score from each player.

	        int player1Score = player1.getScore();
			int player2Score = player2.getScore();
			
			if (player1Score == player2Score) {
				System.out.println();
				System.out.println("*******************");
				System.out.println("The game is a DRAW!");
				System.out.println("*******************");
				System.out.println(player1.finalScore());
				System.out.println(player2.finalScore());
			} else if (player1Score > player2Score) {
				System.out.println();
				System.out.println(String.format("%"+ player1.getName().length()+"s", "").replace(' ', '*') + "******");
				System.out.println(player1.getName() + " WINS!");
				System.out.println(String.format("%"+ player1.getName().length()+"s", "").replace(' ', '*') + "******");
				System.out.println();
				System.out.println(player1.finalScore());
				System.out.println(player2.finalScore());
			} else {
				System.out.println();
				System.out.println(String.format("%"+ player2.getName().length()+"s", "").replace(' ', '*') + "******");
				System.out.println(player2.getName() + " WINS!");
				System.out.println(String.format("%"+ player2.getName().length()+"s", "").replace(' ', '*') + "******");
				System.out.println();
				System.out.println(player1.finalScore());
				System.out.println(player2.finalScore());
			}
		}
	}
	        


