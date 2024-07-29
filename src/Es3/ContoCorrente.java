package Es3;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaExcepion {
        if (nMovimenti < maxMovimenti) this.saldo = saldo - x;
        else this.saldo = saldo - x - 0.50;
        nMovimenti++;
        if (this.saldo < 0) throw new BancaExcepion("Il conto è in rosso.");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }
}
