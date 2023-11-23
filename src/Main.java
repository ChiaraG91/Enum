public class Main {

    public static void main(String[] args){

        Forma forma = new Forma("Quadrato",TipoForma.piana);
        Rettangolo rettangolo = new Rettangolo("Rettangolo",TipoForma.piana,6,3.5);
        Triangolo triangolo = new Triangolo("Triangolo",TipoForma.piana,5.0,7.0);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();


    }
}
