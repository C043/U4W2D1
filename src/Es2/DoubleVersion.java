package Es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DoubleVersion {
    private static Logger logger = LoggerFactory.getLogger(IntVersion.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quanti Km?");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("Quanti litri?");
            double litri = Double.parseDouble(scanner.nextLine());
            if (litri == 0) System.out.println("Benzina infinita!");
            else System.out.println("Il consumo è di " + calcoloConsumo(km, litri) + " km al litro");
        } catch (ArithmeticException e) {
            logger.error("Impossibile dividere per 0");
        } catch (NumberFormatException e) {
            logger.error("Devi inserire dei numeri interi!");
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    private static double calcoloConsumo(double km, double litri) {
        return km / litri;
    }
}

