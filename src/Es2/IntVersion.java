package Es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class IntVersion {
    private static Logger logger = LoggerFactory.getLogger(IntVersion.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quanti Km?");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("Quanti litri?");
            int litri = Integer.parseInt(scanner.nextLine());
            System.out.println("Il consumo è di " + calcoloConsumo(km, litri) + " km al litro");
        } catch (ArithmeticException e) {
            logger.error("Impossibile dividere per 0");
        } catch (NumberFormatException e) {
            logger.error("Devi inserire dei numeri interi!");
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    private static int calcoloConsumo(int km, int litri) {
        return km / litri;
    }
}
