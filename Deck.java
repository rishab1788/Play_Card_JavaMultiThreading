import java.util.*;

public class Deck {

    /* String suits[] = {"H", "D", "S", "C"};
     String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    */ CardsArrangment cardsArrangment = new CardsArrangment();
    ArrayList<Card> cards = new ArrayList();
    Random rand = new Random();

    //int player = 1;
    //int time = 10;   //10 miliseconds
    //  ArrayList<String> CardsOfDeck = new ArrayList<String>(Collections.nCopies(52, ""));
    // ArrayList<String> playersCard[] = new ArrayList[5];

    Deck() {

        for (int i = 0; i < 52; i++) {
            int index = rand.nextInt(52);
            Card c = new Card();
            c.setSuit(cardsArrangment.suits[(index) / 13]);
            c.setValue(cardsArrangment.values[(index) % 13]);
            if (cards.contains(c)) {
                i--;
            } else {
                cards.add(c);
            }
        }

        //giving instance of CardsDrawn for players.
 /*       for (int i = 0; i < 5; i++) {
            playersCard[i] = new ArrayList();
        }
 */

   /* @Override
    public String toString() {
        StringBuilder playersCardString = new StringBuilder();
        int temp = 1;
        for (ArrayList tempAL : playersCard) {
            playersCardString.append("Player " + temp + "#");
            playersCardString.append(tempAL.toString());
            playersCardString.append('\n');
            temp++;
        }
        return playersCardString.toString();
    }
*/

        //generation of cards and storing it into arrays.

        /*for (int i = 0; i < c.suits.length; i++) {
            for (int j = 0; j < c.value.length; j++) {
                int index = rand.nextInt(52);
                if (CardsOfDeck.get(index).equals("")) {
                    CardsOfDeck.remove(index);
                    CardsOfDeck.add(index, c.value[j] + c.suits[i]);
                } else {
                    j--;
                }
            }
        }
        */
        //print all cards
 /*
        for ( int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals("")) {
                System.out.println(arr.get(i));
            }
        }
*/
    }

/*
    public void printPlayersCard() {
        int temp = 1;
        for (ArrayList al : playersCard) {
            System.out.print("Player " + temp + "#");
            for (int i = 0; i < al.size(); i++) {
                System.out.print("-" + al.get(i));
            }
            System.out.println();
            temp++;
        }
    }*/

    /*public void sortPlayersCard() {
        int x = 0;
        for (ArrayList al : playersCard) {
            for (int j = 0; j < 13; j++) {
                for (int i = 0; i < 4; i++) {
                    if (al.contains(c.value[j] + c.suits[i])) {
                        al.remove(c.value[j] + c.suits[i]);
                        al.add(c.value[j] + c.suits[i]);
                        System.out.println(c.value[j] + c.suits[i]);
                    }
                }
            }
        }
    }
*/
/*    public synchronized void distributeCards() {
        for (int i = 0; i < 5; i++) {

            int lastCardIndex = CardsOfDeck.size() - 1;
            String drawnCard = CardsOfDeck.remove(lastCardIndex);// removing last card from cards.

            System.out.println("Player #" + Thread.currentThread().getName() + " " + drawnCard);//Displaying which players thread removing card.

            if (player == 5) {
                player = 1;
                System.out.println();
            } else {
                player++;
            }

            playersCard[player - 1].add(drawnCard);
            //   Thread.currentThread().setPriority(1);

            time = time + 20;

            try {
                wait(time);//
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //  Thread.currentThread().setPriority(10);

        }

    }*/

}