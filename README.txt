* Maatila
Maatila on Helsingin yliopiston Ohjelmoinnin MOOC- kurssilla tehty harjoitusty�.

Maatila koostuu luokista:

- Maitosailio:
    public Maitosailio()
    public Maitosailio(double tilavuus)
    public double getTilavuus()
    public double getSaldo()
    public double paljonkoTilaaJaljella()
    public void lisaaSailioon(double maara) // Lis�� s�ili��n vain niin paljon maitoa kuin sinne mahtuu, ylim��r�iset j��v�t lis��m�tt�, maitos�ili�n ei siis tarvitse huolehtia tilanteesta jossa maitoa valuu yli
    public double otaSailiosta(double maara) // Ottaa s�ili�st� pyydetyn m��r�n, tai niin paljon kuin siell� on j�ljell�

- Lehma (Toteuttaa rajapinnat Eleleva ja Lypsava):
    public Lehma() // luo uuden lehm�n satunnaisesti valitulla nimell�
    public Lehma(String nimi) // luo uuden lehm�n annetulla nimell�
    public String getNimi() // palauttaa lehm�n nimen
    public double getTilavuus() // palauttaa utareiden tilavuuden
    public double getMaara() // palauttaa utareissa olevan maidon m��r�n
    public String toString() // palauttaa lehm�� kuvaavan merkkijonon (ks. esimerkki alla)

- Lypsyrobotti:
    public Lypsyrobotti() // luo uuden lypsyrobotin
    public Maitosailio getMaitosailio() // palauttaa kiinnitetyn maitos�ili� tai null-viitteen, jos s�ili�t� ei ole viel� kiinnitetty
    public void setMaitosailio(Maitosailio maitosailio) // kiinnitt�� annetun s�ili�n lypsyrobottiin
    public void lypsa(Lypsava lypsava) // lyps�� lehm�n robottiin kiinnitettyyn maitos�ili��n, metodi heitt�� poikkeuksen IllegalStateException, jos s�ili�t� ei ole kiinnitetty

- Navetta:
    public Navetta(Maitosailio maitosailio)
    public Maitosailio getMaitosailio() // palauttaa navetan maitosailion
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) // asentaa lypsyrobotin ja kiinnitt�� sen navetan maitos�ili��n
    public void hoida(Lehma lehma) // lyps�� parametrina annetun lehm�n lypsyrobotin avulla, metodi heitt�� poikkeuksen IllegalStateException, jos lypsyrobottia ei ole asennettu
    public void hoida(Collection<Lehma> lehmat) // lyps�� parametrina annetut lehm�t lypsyrobotin avulla, metodi heitt�� poikkeuksen IllegalStateException, jos lypsyrobottia ei ole asennettu
    public String toString() // palauttaa navetan sis�lt�m�n maitos�ili�n tilan

- Maatila (Toteuttaa rajapinnan Eleleva):
	Maatilalla on omistaja ja siihen kuuluu navetta sek� joukko lehmi�