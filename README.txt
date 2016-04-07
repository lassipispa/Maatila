# Maatila
Maatila on Helsingin yliopiston Ohjelmoinnin MOOC- kurssilla tehty harjoitustyö.
Harjoitustyö on ohjelmoitu Javalla.

## Maatila koostuu luokista:

**- Maitosailio:**
    public Maitosailio()
    public Maitosailio(double tilavuus)
    public double getTilavuus()
    public double getSaldo()
    public double paljonkoTilaaJaljella()
    public void lisaaSailioon(double maara) // Lisää säiliöön vain niin paljon maitoa kuin sinne mahtuu, ylimääräiset jäävät 	lisäämättä, maitosäiliön ei siis tarvitse huolehtia tilanteesta jossa maitoa valuu yli
    public double otaSailiosta(double maara) // Ottaa säiliöstä pyydetyn määrän, tai niin paljon kuin siellä on jäljellä

**- Lehma (Toteuttaa rajapinnat Eleleva ja Lypsava):**
    public Lehma() // luo uuden lehmän satunnaisesti valitulla nimellä
    public Lehma(String nimi) // luo uuden lehmän annetulla nimellä
    public String getNimi() // palauttaa lehmän nimen
    public double getTilavuus() // palauttaa utareiden tilavuuden
    public double getMaara() // palauttaa utareissa olevan maidon määrän
    public String toString() // palauttaa lehmää kuvaavan merkkijonon (ks. esimerkki alla)

**- Lypsyrobotti:**
    public Lypsyrobotti() // luo uuden lypsyrobotin
    public Maitosailio getMaitosailio() // palauttaa kiinnitetyn maitosäiliö tai null-viitteen, jos säiliötä ei ole vielä kiinnitetty
    public void setMaitosailio(Maitosailio maitosailio) // kiinnittää annetun säiliön lypsyrobottiin
    public void lypsa(Lypsava lypsava) // lypsää lehmän robottiin kiinnitettyyn maitosäiliöön, metodi heittää poikkeuksen IllegalStateException, jos säiliötä ei ole kiinnitetty

**- Navetta:**
    public Navetta(Maitosailio maitosailio)
    public Maitosailio getMaitosailio() // palauttaa navetan maitosailion
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) // asentaa lypsyrobotin ja kiinnittää sen navetan maitosäiliöön
    public void hoida(Lehma lehma) // lypsää parametrina annetun lehmän lypsyrobotin avulla, metodi heittää poikkeuksen IllegalStateException, jos lypsyrobottia ei ole asennettu
    public void hoida(Collection<Lehma> lehmat) // lypsää parametrina annetut lehmät lypsyrobotin avulla, metodi heittää poikkeuksen IllegalStateException, jos lypsyrobottia ei ole asennettu
    public String toString() // palauttaa navetan sisältämän maitosäiliön tilan

**- Maatila (Toteuttaa rajapinnan Eleleva):**
	Maatilalla on omistaja ja siihen kuuluu navetta sekä joukko lehmiä
