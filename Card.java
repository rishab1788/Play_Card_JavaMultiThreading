import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Card {

    String suit;
    String value;

    Card() {
    }

    Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sameSame = false;

        if (obj != null && obj instanceof Card) {
            sameSame = (this.value.equals(((Card) obj).value) && this.suit.equals(((Card) obj).suit));
        }
        return sameSame;
    }


    @Override
    public String toString() {
        return value + suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}