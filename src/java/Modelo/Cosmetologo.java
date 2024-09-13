package Modelo;

public class Cosmetologo {
    int id;
    String nom;
    String apell;
    long telef;
    String especi;

    public Cosmetologo() {
    }

    public Cosmetologo(String nom, String apell, long telef, String especi) {
        this.nom = nom;
        this.apell = apell;
        this.telef = telef;
        this.especi = especi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public long getTelef() {
        return telef;
    }

    public void setTelef(long telef) {
        this.telef = telef;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }
    
    
    
}
