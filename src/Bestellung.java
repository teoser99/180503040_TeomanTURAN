public class Bestellung {
    private Menü Menü;
    private int Menü_Anzahl;
    private int Gesamtpreis;
    private String Filiale_ID;

    public Menü getMenü() {
        return Menü;
    }

    public void setMenü(Menü menü) {
        Menü = menü;
    }

    public int getMenü_Anzahl() {
        return Menü_Anzahl;
    }

    public void setMenü_Anzahl(int menü_Anzahl) {
        Menü_Anzahl = menü_Anzahl;
    }

    public int getGesamtpreis() {
        return Gesamtpreis;
    }

    public void setGesamtpreis(int gesamtpreis) {
        Gesamtpreis = gesamtpreis;
    }

    public String getFiliale_ID() {
        return Filiale_ID;
    }

    public void setFiliale_ID(String filiale_ID) {
        Filiale_ID = filiale_ID;
    }
}
