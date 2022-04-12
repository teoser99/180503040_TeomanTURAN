public class Kunde {
    private String EMail_Adresse;
    private String Kundenname;
    private String Nachname;
    private String Adressinfo;
    private String Passwort;
    private Abonnement Abonnement;

    public String getEMail_Adresse() {
        return EMail_Adresse;
    }

    public void setEMail_Adresse(String EMail_Adresse) {
        this.EMail_Adresse = EMail_Adresse;
    }

    public String getKundenname() {
        return Kundenname;
    }

    public void setKundenname(String kundenname) {
        Kundenname = kundenname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getAdressinfo() {
        return Adressinfo;
    }

    public void setAdressinfo(String adressinfo) {
        Adressinfo = adressinfo;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }

    public Abonnement getAbonnement() {
        return Abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        Abonnement = abonnement;
    }
}
