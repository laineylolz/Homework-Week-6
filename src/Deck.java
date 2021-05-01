import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//i. Fields:
	
		public List<Card> cards = new ArrayList<>();

	//3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

		public Deck() {
			Card twoOfSpades = new Card(2, "Two of Spades");
			Card threeOfSpades = new Card(3, "Three of Spades");
			Card fourOfSpades = new Card(4, "Four of Spades");
			Card fiveOfSpades = new Card(5, "Five of Spades");
			Card sixOfSpades = new Card(6, "Six of Spades");
			Card sevenOfSpades = new Card(7, "Seven of Spades");
			Card eightOfSpades = new Card(8, "Eight of Spades");
			Card nineOfSpades = new Card(9, "Nine of Spades");
			Card tenOfSpades = new Card(10, "Ten of Spades");
			Card jackOfSpades = new Card(11, "Jack of Spades");
			Card queenOfSpades = new Card(12, "Queen of Spades");
			Card kingOfSpades = new Card(13, "King of Spades");
			Card aceOfSpades = new Card(14, "Ace of Spades");

			Card twoOfHearts = new Card(2, "Two of Hearts");
			Card threeOfHearts = new Card(3, "Three of Hearts");
			Card fourOfHearts = new Card(4, "Four of Hearts");
			Card fiveOfHearts = new Card(5, "Five of Hearts");
			Card sixOfHearts = new Card(6, "Six of Hearts");
			Card sevenOfHearts = new Card(7, "Seven of Hearts");
			Card eightOfHearts = new Card(8, "Eight of Hearts");
			Card nineOfHearts = new Card(9, "Nine of Hearts");
			Card tenOfHearts = new Card(10, "Ten of Hearts");
			Card jackOfHearts = new Card(11, "Jack of Hearts");
			Card queenOfHearts = new Card(12, "Queen of Hearts");
			Card kingOfHearts = new Card(13, "King of Hearts");
			Card aceOfHearts = new Card(14, "Ace of Hearts");
			
			Card twoOfDiamonds = new Card(2, "Two of Diamonds");
			Card threeOfDiamonds = new Card(3, "Three of Diamonds");
			Card fourOfDiamonds = new Card(4, "Four of Diamonds");
			Card fiveOfDiamonds = new Card(5, "Five of Diamonds");
			Card sixOfDiamonds = new Card(6, "Six of Diamonds");
			Card sevenOfDiamonds = new Card(7, "Seven of Diamonds");
			Card eightOfDiamonds = new Card(8, "Eight of Diamonds");
			Card nineOfDiamonds = new Card(9, "Nine of Diamonds");
			Card tenOfDiamonds = new Card(10, "Ten of Diamonds");
			Card jackOfDiamonds = new Card(11, "Jack of Diamonds");
			Card queenOfDiamonds = new Card(12, "Queen of Diamonds");
			Card kingOfDiamonds = new Card(13, "King of Diamonds");
			Card aceOfDiamonds = new Card(14, "Ace of Diamonds");
			
			Card twoOfClubs = new Card(2, "Two of Clubs");
			Card threeOfClubs = new Card(3, "Three of Clubs");
			Card fourOfClubs = new Card(4, "Four of Clubs");
			Card fiveOfClubs = new Card(5, "Five of Clubs");
			Card sixOfClubs = new Card(6, "Six of Clubs");
			Card sevenOfClubs = new Card(7, "Seven of Clubs");
			Card eightOfClubs = new Card(8, "Eight of Clubs");
			Card nineOfClubs = new Card(9, "Nine of Clubs");
			Card tenOfClubs = new Card(10, "Ten of Clubs");
			Card jackOfClubs = new Card(11, "Jack of Clubs");
			Card queenOfClubs = new Card(12, "Queen of Clubs");
			Card kingOfClubs = new Card(13, "King of Clubs");
			Card aceOfClubs = new Card(14, "Ace of Clubs");
		
		
				cards.add(aceOfSpades);
				cards.add(twoOfSpades);
				cards.add(threeOfSpades);
				cards.add(fourOfSpades);
				cards.add(fiveOfSpades);
				cards.add(sixOfSpades);
				cards.add(sevenOfSpades);
				cards.add(eightOfSpades);
				cards.add(nineOfSpades);
				cards.add(tenOfSpades);
				cards.add(jackOfSpades);
				cards.add(queenOfSpades);
				cards.add(kingOfSpades);
				
				cards.add(aceOfHearts);
				cards.add(twoOfHearts);
				cards.add(threeOfHearts);
				cards.add(fourOfHearts);
				cards.add(fiveOfHearts);
				cards.add(sixOfHearts);
				cards.add(sevenOfHearts);
				cards.add(eightOfHearts);
				cards.add(nineOfHearts);
				cards.add(tenOfHearts);
				cards.add(jackOfHearts);
				cards.add(queenOfHearts);
				cards.add(kingOfHearts);
				
				cards.add(aceOfDiamonds);
				cards.add(twoOfDiamonds);
				cards.add(threeOfDiamonds);
				cards.add(fourOfDiamonds);
				cards.add(fiveOfDiamonds);
				cards.add(sixOfDiamonds);
				cards.add(sevenOfDiamonds);
				cards.add(eightOfDiamonds);
				cards.add(nineOfDiamonds);
				cards.add(tenOfDiamonds);
				cards.add(jackOfDiamonds);
				cards.add(queenOfDiamonds);
				cards.add(kingOfDiamonds);
				
				cards.add(aceOfClubs);
				cards.add(twoOfClubs);
				cards.add(threeOfClubs);
				cards.add(fourOfClubs);
				cards.add(fiveOfClubs);
				cards.add(sixOfClubs);
				cards.add(sevenOfClubs);
				cards.add(eightOfClubs);
				cards.add(nineOfClubs);
				cards.add(tenOfClubs);
				cards.add(jackOfClubs);
				cards.add(queenOfClubs);
				cards.add(kingOfClubs);
			
			}
		
	//ii. Methods:

		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		public Card draw() {
			Card removedFromDeck =  cards.remove(0);
			return removedFromDeck;
		}
}
