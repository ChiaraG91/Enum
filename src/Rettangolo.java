public class Rettangolo extends Forma{

    public double base;

    public double altezza;

    public Rettangolo(String nomeForma, TipoForma tipo,double base,double altezza) {
        super(nomeForma, tipo);
        this.altezza = altezza;
        this.base = base;
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

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println(getAltezza() * getBase());
    }

}
