package cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {

    /**
     * Shuffles a list of objects in place.  Moves objects around until the order is
     * completely random.  This method changes the order of the elements in 'list', but
     * does not add or remove any.
     */
    public static <T> void shuffle(List<T> list) {
        final Random random = new Random();
        // The Fisher-Yates shuffle algorithm.
        for (int i = list.size() - 1; i >= 1; --i) {
            final int j = random.nextInt(i + 1);
            // Swap element i with element j.
            final T swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);
        }
    }

    /**
     * @return
     *   A list containing all cards, in a random order.
     */
    public static List<Card> getShuffledDeck() {
        final List<Card> deck = new ArrayList<Card>();
        // Add all cards to the deck, in order.
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Number number : Card.Number.values())
                deck.add(new Card(suit, number));
        // Shuffle the deck.
        shuffle(deck);
        return deck;
    }

    /**
     * Deals playing card hands from a single shuffled deck.
     *
     * @param numPlayers
     *   The number of players in the card game.
     * @param numCards
     *   The number of cards in each player's hand.
     * @return
     *   A list of players' hands. The number of hands is 'numPlayers'. Each hand contains
     *   cards; the size of each hand is 'numCards'. No card is present more than once.
     */
    //FIXME
    public static List<List<Card>> deal(int numPlayers, int numCards) {
        List<List<Card>> gameHand = new ArrayList<List<Card>>();
        ArrayList<Card>playerCards;
        for (int j = 1; j < numCards ; j++){
         playerCards = new ArrayList<Card>();
            for (int i = j; i <= numPlayers ; i++) {
                playerCards.add(getShuffledDeck().get(i));
                gameHand.add(playerCards);
            }

        }


        return gameHand;
    }

    public static void main(String[] args) {
        // Deal four 5-card hands, and print them out.
        List<List<Card>> hands = deal(4, 4);

        for (int h = 0; h < hands.size(); ++h) {
            System.out.println("player " + h + " holds:");
            for (Card c : hands.get(h))
                System.out.println("  " + c);
        }
    }

}
