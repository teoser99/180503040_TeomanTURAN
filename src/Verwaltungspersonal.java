import java.util.Scanner;

public class Verwaltungspersonal {
    private String ID_Nummer;
    private String Vorname;
    private String Nachname;
    private String Passwort;
    private Berechtige_Person Berechtige_Person;
    Scanner scanner = new Scanner(System.in);

    public Verwaltungspersonal(String ID_Nummer, String vorname, String nachname, String passwort,
                               Berechtige_Person berechtige_Person) {
        this.ID_Nummer = ID_Nummer;
        this.Vorname = vorname;
        this.Nachname = nachname;
        this.Passwort = passwort;
        this.Berechtige_Person = berechtige_Person;
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

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }

    public Berechtige_Person getBerechtige_Person() {
        return Berechtige_Person;
    }

    public void setBerechtige_Person(Berechtige_Person berechtige_Person) {
        Berechtige_Person = berechtige_Person;
    }
}
