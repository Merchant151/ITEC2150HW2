# ITEC2150HW2
5 classes to model a deck of cards

ITEC 2150 Homework 2

You are required to create six five classes in this assignment.  
Card
CardTester
CardDeck
InvalidCardException
InvalidDeckException

The first class, Card will model a standard playing card.  Suits for each Card can be Spade, Heart, Club, or Diamond.  The value can be Ace through 10, jack, Queen and King.  Order of the cards will be based on the value first and then on the suit. For this assignment, Ace will be considered high.  Suit order is Spade, Heart, Diamond and then Club.

CardDeck, will model a deck of cards and provide methods to access the cards.  The deck will contain 52 cards, one of each of the possible Suit and Value.  

CardTester,  will allow the user to call methods on the Card and CardDeck classes.  Please spend some time thinking about your interface for the cards class.  

InvalidCardException – a custom exception to be used when a Card is found to be invalid.

InvalidDeckException – a custom exception to be used when a CardDeck is found to be invalid.

CardDeck class requirements:

The CardDeck class will model a standard deck of playing cards.  This deck will contain 52 cards, Ace through King in four suits, Spades, Clubs, Diamonds and Hearts.  Recommend using an ArrayList<Card> to hold the cards.  This class must provide the following methods:
public CardDeck() – This constructor will create the deck of cards and place them in the following order:
Spades Ace to King
Hearts Ace to King
Diamonds Ace to King
Clubs Ace to King
public void shuffle() – This method will take the constructed deck and randomize the cards and store the new ordering of all cards.
public Card deal() – This method will “deal” the next card in the deck.   We will deal with an empty deck in future assignments.
public Card selectCard(int cardNumber) – This method will return the card at a specific location, similar to cutting the deck.  The program must not allow for an out of bounds “cut”.  In other words, if the user passes a number that is out of range, an InvalidDeckException will be thrown and must be handled in the CardTester class. 
public void saveDeck(String fileName) – This method will write the current deck to a file.  This method should throw a FileNotFoundException if an error occurs in writing the file.
public void loadDeck(String fileName) – This method will read the supplied file and create a deck from this file.  If an invalid deck is discovered, please create and throw an InvalidDeckException.  This method should throw a FileNotFoundException if the file name is invalid.


CardTester class

The CardTester class will instantiate an instance of the CardDeck.  Following the construction of the CardDeck object and before any other method on the deck is called, the program will save the unshuffled deck of cards.  Each card should be on its own line in the file.  Your file should display Ace of Spades, 2 of Spades…King of Clubs.  You should save this to the file unshuffled.cards.  Your unshuffled deck should be printed all cards of a suit on a single line.  

Following the file creation, call the shuffle() method.   Call your save method and save the deck of cards in their shuffled order.  The cards should be in a random order.  You should save this to the file shuffled.cards.  Note: unshuffled and shuffled must be written using the same method.  You should print the unshuffled deck to the console with 13 cards on each line.

Provide a menu with a loop allowing the user to:
View saved deck
Play a card from the current deck, user will need to enter a number from 1 – 52.  This must be validated.  Display the card at that position.
Exit the program

Grading:
Proper Javadoc and commenting – 10 points
Good variable, class and method naming – 10 points
Card – 10 points
CardDeck – 10 points
CardTester class – 10 points
Shuffled and unshuffled files – 15
Deck save – 10 points
Deck Load with exception – 10 points
Correct implementation and function – 15 points

Sample output:
AS 2S 3S 4S 5S 6S 7S 8S 9S 10S JS QS KS
AH 2H 3H 4H 5H 6H 7H 8H 9H 10H JH QH KH
AD 2D 3D 4D 5D 6D 7D 8D 9D 10D JD QD KD
AC 2C 3C 4C 5C 6C 7C 8C 9C 10C JC QC KC
The shuffled deck
5C 3S 10C 6S 10S 7H AH KH KS 7S QH 7C 5D
JH 8C JC 5H 2D 3H KC 4H 3C 10D 8D 6C 4D
QC 4C 9S 9D 8S 10H 9C 6H 9H 2S QS 2C AD
8H 7D QD 4S 6D JS 2H 3D KD AS AC JD 5S

Viewing a saved deck
Do you want to view the shuffled or unshuffled deck. (S/U)
S
5C 3S 10C 6S 10S 7H AH KH KS 7S QH 7C 5D
JH 8C JC 5H 2D 3H KC 4H 3C 10D 8D 6C 4D
QC 4C 9S 9D 8S 10H 9C 6H 9H 2S QS 2C AD
8H 7D QD 4S 6D JS 2H 3D KD AS AC JD 5S
Please enter the card number you would like to play (1 - 52)
27
QC
