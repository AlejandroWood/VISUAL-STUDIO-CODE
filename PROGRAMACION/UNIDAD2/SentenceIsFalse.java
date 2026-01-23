package UNIDAD2;

import java.util.Scanner;

public class SentenceIsFalse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sentence = "true";
        boolean loop = false;

        System.out.print("This sentence is: ");
        sentence = teclado.next();

        if (sentence.equalsIgnoreCase("false")) {
            loop = true;
        } else {
            loop = false;
        }

        if (loop) {
            System.out.println("If this sentence is false then that would mean that the sentence is true");

            while (loop) {
                System.out.println("But if the sentence is true then that would mean that the sentece is false");
                System.out.println("But if the sentence is false then that would mean that the sentence is true");
            }
        } else {
            System.out.println("This sentence is true");
        }

        

        teclado.close();
    }
}
