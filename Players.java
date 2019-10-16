import java.util.ArrayList;

public class Players {
    ArrayList<Card> cards = new <Card>ArrayList(); //it contains all cards of a player
    CardsArrangment cardsArrangment = new CardsArrangment();

    Players() {
    }

    void printPlayerCards() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.print("-" + cards.get(i));
        }
    }

    void sortPlayerCards() {

        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 4; i++) {
                Card c = new Card(cardsArrangment.suits[i], cardsArrangment.values[j]);
                if (cards.contains(c)) {
                    cards.remove(c);
                    cards.add(c);
                }
            }
        }

    }

    @Override
    public String toString() {
        String s = "Cards";
        for (int i = 0; i < cards.size(); i++) {
            s += "-" + cards.get(i);
        }
        s += '\n';
        return s;
    }
}



