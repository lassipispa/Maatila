package maatilasimulaattori;

import java.util.Collection;

public class Navetta {

    private Maitosailio sailio;
    private Lypsyrobotti robotti;

    public Navetta(Maitosailio maitosailio) {
        this.sailio = maitosailio;
        this.robotti = null;
    }

    public Maitosailio getMaitosailio() {
        return this.sailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.robotti = lypsyrobotti;
        this.robotti.setMaitosailio(this.sailio);
    }

    public void hoida(Lehma lehma) {
        if (this.robotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        } else {
            this.robotti.lypsa(lehma);
        }
    }

    public void hoida(Collection<Lehma> lehmat) {
        if (this.robotti == null) {
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu");
        } else {
            for (Lehma lehma : lehmat) {
                this.hoida(lehma);
            }
        }
    }

    public String toString() {
        return this.sailio.toString();
    }
}
