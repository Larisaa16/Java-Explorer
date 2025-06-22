package basic;

public class Trainer extends Persoana{

    public Trainer(String nume, String prenume, String oras, int varsta, boolean casatorita){
        super(nume,prenume,oras,varsta,casatorita);
    }

    @Override
    public String getResponsabilitati() {
        return " Pregatirea materialelor, evaluarea temelor, crearea contextului de lucru, raspunderea la intrebari";
    }

    @Override
    public String obtineIdentificator(){
        return "trainer_"+super.obtineIdentificator();
    }
}
