import java.util.ArrayList;
import java.util.List;

public class Player {

	//i. Fields:
	
		private List<Card> hand = new ArrayList<Card>();
	
		private int score;
    
		private String name;
	
	//ii. Methods:
		
	    public Player(String playerName, int playerScore) {
	    	name = playerName;
	    	score = 0;
	    	score = playerScore;
		}
	    
        public void describe() {
    	
        for(Card card : hand) {
        	
            card.describe();
        }
        
        }
        
	    public Card flip() {
			return hand.remove(0);	
	    }

	    public void draw(Deck deck) {
	        hand.add(deck.draw());
	    }

	    public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
	    
	    public void incrementScore(){
	        setScore(getScore() + 1);
	    }

		public String getName() {
			return name;
		}
		
		public String finalScore() {
			
		return name + " has a final score of " + score;
}
		
}
