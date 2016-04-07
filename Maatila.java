package maatilasimulaattori;

import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva {

    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;

    public Maatila(String nimi, Navetta navetta) {
        this.omistaja = nimi;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }

    public void lisaaLehma(Lehma lisattava) {
        this.lehmat.add(lisattava);
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
        this.navetta.asennaLypsyrobotti(robo);
    }

    @Override
    public void eleleTunti() {
        for (Lehma lehma : this.lehmat) {
            lehma.eleleTunti();
        }
    }

    public void hoidaLehmat() {
        this.navetta.hoida(lehmat);
    }

    public String getOmistaja() {
        return this.omistaja;
    }

    @Override
    public String toString() {

        String tuloste = "Maatilan omistaja: " + getOmistaja() + "\n"
                + "Navetan maitosäiliö: "
                + this.navetta.getMaitosailio().toString() + "Lehmät:\n";
        for (Lehma lehma : this.lehmat) {
            tuloste = tuloste + "        " + lehma.toString() + "\n";
        }
        return tuloste;
    }

}
