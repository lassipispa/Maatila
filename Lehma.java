package maatilasimulaattori;

import java.util.Random;

public class Lehma implements Eleleva, Lypsava {

    private String nimi;
    private double tilavuus;
    private double saldo;
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    // Jos konstruktorille ei anneta parametrinä nimeä, se valitaan arpomalla
    // NIMIA- taulukosta
    public Lehma() {
        this("");
        int i = new Random().nextInt(NIMIA.length);
        this.nimi = NIMIA[i];
    }

    public Lehma(String nimi) {
        this.nimi = nimi;
        this.tilavuus = new Random().nextInt(26) + 15;
        this.saldo = 0;
    }

    @Override
    public double lypsa() {
        // Tallennetaan nykyinen maidon määrä muttujaan, tyhjennetään
        // utareet ja palautetaan tallennettu maidon määrä
        double lypsetty = this.saldo;
        this.saldo = 0;
        return lypsetty;
    }

    @Override
    public void eleleTunti() {
        // Luodaa satunnainen maitomäärä väliltä 0.7 - 2.0 ja lisätään
        // sitä utareisiin niin paljon kuin mahtuu
        double maitoa = new Random().nextDouble() * (2.0 - 0.7) + 0.7;
        if (maitoa <= this.tilavuus - this.saldo) {
            this.saldo = this.saldo + maitoa;
        } else {
            this.saldo = this.tilavuus;
        }

    }

    public String getNimi() {
        return this.nimi;
    }

    public double getTilavuus() {
        return this.tilavuus;
    }

    public double getMaara() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "" + this.nimi + " " + Math.ceil(this.saldo)
                + "/" + Math.ceil(this.tilavuus);
    }

}
