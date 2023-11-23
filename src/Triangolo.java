public class Triangolo extends Forma {

    public double base;

    public double altezza;

    public Triangolo(String nomeForma, TipoForma tipo, double base, double altezza) {
        super(nomeForma, tipo);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void calcolaArea() {
        super.calcolaArea();
        System.out.println((getAltezza() * getBase()) / 2);
    }
}
