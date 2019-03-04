methods:
	start
	checkWinner
	aceValue
	splitHand
	
arrays:
	playerHand
	splitHand
	
boolean:
	keepGoing: false if hand is over 21
	ace: true if ace is in hand
	
class:
	
class Deck
	int deckSize = 52
	suits: HEARTS, CLUBS, SPADES, DIAMONDS
	rank: ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, TEN, JACK, QUEEN, KING
	
	//methods
	shuffle
	hit
	fold
	aceValue
	
	array int deckPosition

class DealerHand
	int handValue
	array of cards
	while handValue is 16 or less, hit

class PlayerHand
	int handValue
	array of cards

	//methods
	splitHand
	
class main
	//ask player to start
	//start game
	//deal cards
	
	
	//after each card:
	//check for blackjack
	//check for ace
	//check for splitHand
	
	//check winner
	
	
	
	