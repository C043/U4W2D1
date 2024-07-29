package Es0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        logger.info("Inserisci un numero compreso fra 1 e 10");
        int input = Integer.parseInt(scanner.nextLine());
        try {
            int result = numbers[input] / input;
            logger.info("Il risultato è {}", result);
        } catch (Exception e) {
            logger.error("Dovevi inserire un numero da 1 a 10!");
        }
    }
}
