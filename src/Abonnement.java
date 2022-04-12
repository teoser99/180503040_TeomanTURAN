public class Abonnement {
    private Menü Menü;
    private String Startdatum;
    private String Enddatum;
    private boolean Zahlungsstatus;
    private Bestellung Bestellung;

    public Abonnement(Menü menü, String startdatum, String enddatum, boolean zahlungsstatus, Bestellung bestellung) {
        this.Menü = menü;
        this.Startdatum = startdatum;
        this.Enddatum = enddatum;
        this.Zahlungsstatus = zahlungsstatus;
        this.Bestellung = bestellung;
    }

    public Menü getMenü() {
        return Menü;
    }

    public void setMenü(Menü menü) {
        Menü = menü;
    }

    public String getStartdatum() {
        return Startdatum;
    }

    public void setStartdatum(String startdatum) {
        Startdatum = startdatum;
    }

    public String getEnddatum() {
        return Enddatum;
    }

    public void setEnddatum(String enddatum) {
        Enddatum = enddatum;
    }

    public boolean isZahlungsstatus() {
        return Zahlungsstatus;
    }

    public void setZahlungsstatus(boolean zahlungsstatus) {
        Zahlungsstatus = zahlungsstatus;
    }

    public Bestellung getBestellung() {
        return Bestellung;
    }

    public void setBestellung(Bestellung bestellung) {
        Bestellung = bestellung;
    }
}
