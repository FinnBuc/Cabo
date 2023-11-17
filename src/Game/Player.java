package Game;

public class Player {
    private String name;

    private Card[] cards = new Card[4];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void setCard(Card card, int i) {
        cards[i] = card;
    }
}
