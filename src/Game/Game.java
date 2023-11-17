package Game;

import java.util.LinkedList;
import java.util.List;

public class Game {

    private Player[] players = new Player[0];
    private final RoundManager roundManager = new RoundManager(players);
    private final List<Card> discardPile = new LinkedList<>();
    private final List<Card> deck = new LinkedList<Card>();
    private GamePresenter gamePresenter ;

    // Methods

    public void start(){
        gamePresenter = new GamePresenter(players.length);
        generateDeck();
        shuffleDeck();
        discard(deck.remove(0));
        setUpStartCards();
        roundManager.start();
    }

    private void generateDeck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(new Card(i));
            }
        }
        deck.add(new Card(13));
        deck.add(new Card(13));
    }

    private void shuffleDeck() {
        for (int i = 0; i < 1000 ; i++) {
            int position = getRandomNumber(0, 54);
            Card temp = deck.get(position);
            deck.remove(position);
            deck.add(temp);
        }
    }

    private void setUpStartCards() {
        for (int i=0; i < players.length; i++) {
            Card[] cards = new Card[4];
            for (int j=0; j < 4; j++) {
                cards[j] = deck.remove(0);
            }
            players[i].setCards(cards);
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).getValue());
        }
    }

    private void discard(Card card) {
        discardPile.add(card);
        gamePresenter.discardPile.setText("ja");
    }
    // Constructor
    public Game(Player[] players) {
        this.players = players;
    }

    // getter
    public Player[] getPlayers() {
        return players;
    }

}
