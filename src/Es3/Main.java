package Es3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente aldo = new ContoCorrente("Aldo", 1000);
        ContoOnline giacomo = new ContoOnline("Giacomo", 2000, 1000);

        while (aldo.saldo > 0 && giacomo.saldo > 0 && aldo.nMovimenti < aldo.maxMovimenti && giacomo.nMovimenti < giacomo.maxMovimenti) {
            System.out.println("Quanto vuoi prelevare?");
            try {
                double prelievo = Double.parseDouble(scanner.nextLine());
                giacomo.preleva(prelievo);
                aldo.preleva(prelievo);
            } catch (BancaExcepion e) {
                logger.error(e.getMessage());
            } catch (NumberFormatException e) {
                logger.error("Devi inserire un numero!");
            } catch (Exception e) {
                logger.error("Errore generico");
            }
        }
    }
}
