


public class Persoana {
    private String nume;
    private String prenume;
    private String oras;
    private int varsta;
    private boolean casatorita;
    public static String curs;

    public Persoana(String nume, String prenume, String oras, int varsta, boolean casatorita){
        this.nume=nume;
        this.prenume=prenume;
        this.oras=oras;
        this.varsta=varsta;
        this.casatorita=casatorita;
    }

    public Persoana() {
        this.nume = "";
        this.prenume = "";
        this.oras = "";
        this.varsta = 0;
        this.casatorita = false;
    }

    public void creste(){
        varsta+=1;
    }

    public String obtineIdentificator() {
        return prenume.replace("-", "").replaceAll("\\s+", "").toLowerCase()
                + "_" +
                nume.toUpperCase();
    }

    public String getNume(){ return nume; }
    public void setNume(String nume) { this.nume=nume; }

    public String getPrenume(){ return prenume; }
    public void setPrenume(String prenume) { this.prenume=prenume; }

    public String getOras(){ return oras; }
    public void setOras(String oras) { this.oras=oras; }

    public int getVarsta(){ return varsta; }
    public void setVarsta(int varsta) { this.varsta=varsta; }

    public boolean isCasatorita() { return casatorita; }
    public void setCasatorita(boolean casatorita) { this.casatorita=casatorita; }

    public String toString(){
        return "Persoana [nume="+nume+", prenume="+prenume+ ", oras="+oras+", varsta="+varsta+", casatorita="+casatorita+", curs="+curs+"]";
    }

}
