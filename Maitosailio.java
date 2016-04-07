package maatilasimulaattori;

public class Maitosailio {

    private double tilavuus;
    private double saldo;

    public Maitosailio() {
        this(2000.0);
    }

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return this.tilavuus;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double paljonkoTilaaJaljella() {
        return this.tilavuus - this.saldo;
    }

    public void lisaaSailioon(double maara) {
        // Jos lisättävä määrä mahtuu kokonaisuudessaan säiliöön,
        // lisätään se sinne, muuten lisätään sen verran kuin säiliössä on
        // tilaa jäljellä
        if (this.paljonkoTilaaJaljella() >= maara) {
            this.saldo = this.saldo + maara;
        } else {
            this.saldo = this.saldo + this.paljonkoTilaaJaljella();
        }
    }

    public double otaSailiosta(double maara) {
        if (this.saldo >= maara) {
            this.saldo = this.saldo - maara;
            return this.saldo;
        } else {
            double otetaan = this.saldo;
            this.saldo = 0;
            return otetaan;
        }
    }
    
    @Override
    public String toString(){
        return "" + Math.ceil(this.saldo) + "/" + Math.ceil(this.tilavuus);
    }
}
