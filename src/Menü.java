public class Menü {
    private int Preis;
    private String Inhalt;

    public Menü(int preis, String inhalt) {
        this.Preis = preis;
        this.Inhalt = inhalt;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public String getInhalt() {
        return Inhalt;
    }

    public void setInhalt(String inhalt) {
        Inhalt = inhalt;
    }
}
