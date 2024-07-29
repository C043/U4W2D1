package Es3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + this.titolare + " - Saldo: " + this.saldo + " - Num movimenti: " + this.nMovimenti + " - Massimo movimenti: " + this.maxMovimenti + " - Massimo prelievo possibile: " + this.maxPrelievo);
    }

    public void preleva(double x) {
        if (x <= this.maxPrelievo) {
            super.preleva(x);
        }
    }
}
