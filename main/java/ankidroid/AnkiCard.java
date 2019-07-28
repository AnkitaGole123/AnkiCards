package ankidroid;

import java.util.Scanner;

public class AnkiCard {
    public static void main(String[] args) {
        Deck remember = new Deck("remember");
        remember.addCard("what is object", "instance of class");
        remember.addCard("what is class", "blueprint");
        remember.addCard("what is TDD", "Test Driven Development");
        for (Card cards: remember.getCards()){
            Scanner input = new Scanner(System.in);
            System.out.println(cards.frontDescription);
            System.out.println("you want to see answer?");
            String answer = input.nextLine();
            System.out.println(cards.backDescription);
        }

    }

}
