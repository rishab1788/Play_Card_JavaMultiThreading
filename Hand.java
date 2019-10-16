import java.io.IOException;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Hand implements Runnable {

    static Deck d = new Deck();
    Players p[] = new Players[5];
    int playerNumber = 1;
    int time = 10;
    Random rand = new Random();

    Hand() {

        //instancing the Players Cards.
        for (int i = 0; i < 5; i++) {
            p[i] = new Players();
        }

    }

    public static void main(String[] args) throws InterruptedException, IOException {

        Hand hand = new Hand();
        // Thread.currentThread().setPriority(10); //make sure first main thread start all threads.

        Thread t1 = new Thread(hand);
        Thread t2 = new Thread(hand);
        Thread t3 = new Thread(hand);
        Thread t4 = new Thread(hand);
        Thread t5 = new Thread(hand);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        try {

            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            //after running job of all thread print the players card from main method.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //d.sortPlayersCard();  //sorting the cards.

        hand.sortPlayersCard();

        //printing players card.
        hand.printPlayersCard();
        hand.writeInFile();

    }

    private void writeInFile() throws IOException {
        //writing in a file.
        FileOperation fo = new FileOperation();
        try {
            for (Players player : p) {
                fo.usingBufferedWritter(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fo.closeFileConnection();
    }

    private void sortPlayersCard() {
        for (Players player : p) {
            player.sortPlayerCards();

        }

    }


    public void printPlayersCard() {
        int temp = 1;
        for (Players player : p) {
            System.out.print("Player " + temp + "#");
            player.printPlayerCards();
            System.out.println();
            temp++;
        }
    }

    @Override
    public void run() {
        distributeCards(); // Cards Distribution among players
    }

    public synchronized void distributeCards() {

        Thread.currentThread().setName("Player-" + playerNumber);
        for (int i = 0; i < 5; i++) {
            int lastCardIndex = d.cards.size() - 1;

            Card drawnCard = d.cards.remove(lastCardIndex);// removing last card from cards.
            System.out.println("Player #" + Thread.currentThread().getName() + " " + drawnCard);//Displaying which players thread removing card.


            if (playerNumber == 5) {
                playerNumber = 1;
                System.out.println();
            } else {
                playerNumber++;
            }
            p[playerNumber - 1].cards.add(drawnCard);
            //   Thread.currentThread().setPriority(1);
            time = time + 20;
            try {
                wait(time);//
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}