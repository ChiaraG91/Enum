enum TipoForma{
    piana,
    solida,
}


public class Forma {

    public String nomeForma;

    public final TipoForma tipo;


    public Forma(String nomeForma, TipoForma tipo){
        this.nomeForma = nomeForma;
        this.tipo = tipo;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public TipoForma getTipo() {
        return tipo;
    }


    public void calcolaArea(){
        System.out.println();
    }
}

