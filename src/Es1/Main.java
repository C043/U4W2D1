package Es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] randomNums = new int[5];
        for (int i = 0; i < randomNums.length; i++) {
            int randomNum = rand.nextInt(1, 10);
            randomNums[i] = randomNum;
        }
        System.out.println(Arrays.toString(randomNums));
        int index = 10;
        while (index > 0) {
            System.out.println("A che indice vuoi inserire il tuo numero? Inserire l'indice, inserire 0 pernuscire dall'applicazione");
            try {
                index = Integer.parseInt(scanner.nextLine());
                arrayChanger(index, randomNums);
            } catch (NumberFormatException e) {
                logger.error("Devi inserire un numero intero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Indice fuori dall'array, riprova!");
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
    }

    private static void arrayChanger(int index, int[] arr) {
        Random rand = new Random();
        arr[index] = rand.nextInt(1, 10);
        System.out.println(Arrays.toString(arr));
    }
}
