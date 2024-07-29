import Es3.BancaExcepion;
import Es3.ContoCorrente;
import Es3.ContoOnline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente aldo = new ContoCorrente("Aldo", 20000);
        ContoOnline giacomo = new ContoOnline("Giacomo", 2000, 10000);

        while (aldo.getSaldo() > 0 && giacomo.getSaldo() > 0 && aldo.getnMovimenti() < aldo.getMaxMovimenti() && giacomo.getnMovimenti() < giacomo.getMaxMovimenti()) {
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