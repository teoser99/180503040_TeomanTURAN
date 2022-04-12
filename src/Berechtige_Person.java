public class Berechtige_Person {
    private String ID_Nummer;
    private String Vorname;
    private String Nachname;
    private String Benutzername;
    private String Passwort;
    private String Filiale_ID;
    private Kunde Kunde;
    private Abonnement Abonnement ;
    private Bestellung Bestellung;

    public Berechtige_Person(String ID_Nummer, String vorname, String nachname, String benutzername, String passwort,
                             String filiale_ID, Kunde kunde, Abonnement abonnement, Bestellung bestellung) {
        this.ID_Nummer = ID_Nummer;
        this.Vorname = vorname;
        this.Nachname = nachname;
        this.Benutzername = benutzername;
        this.Passwort = passwort;
        this.Filiale_ID = filiale_ID;
        this.Kunde = kunde;
        this.Abonnement = abonnement;
        this.Bestellung = bestellung;
    }

    public String getID_Nummer() {
        return ID_Nummer;
    }

    public void setID_Nummer(String ID_Nummer) {
        this.ID_Nummer = ID_Nummer;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public void setBenutzername(String benutzername) {
        Benutzername = benutzername;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }

    public String getFiliale_ID() {
        return Filiale_ID;
    }

    public void setFiliale_ID(String filiale_ID) {
        Filiale_ID = filiale_ID;
    }

    public Kunde getKunde() {
        return Kunde;
    }

    public void setKunde(Kunde kunde) {
        Kunde = kunde;
    }

    public Abonnement getAbonnement() {
        return Abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        Abonnement = abonnement;
    }

    public Bestellung getBestellung() {
        return Bestellung;
    }

    public void setBestellung(Bestellung bestellung) {
        Bestellung = bestellung;
    }
}
