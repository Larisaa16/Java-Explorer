package Activities;

import basic.Persoana;
import basic.Trainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Curs implements Activity{

    private String nume;
    private String dificultate;
    private Persoana trainer;
    private ArrayList<Persoana> exploreri;
    private int cost;
    private LinkedHashMap<String, Activity> materiale=new LinkedHashMap<>();

    public Curs(String nume, String dificultate, Persoana trainer, ArrayList<Persoana> exploreri, int cost){
        this.nume = nume;
        this.dificultate = dificultate;
        this.trainer = trainer;
        this.exploreri = exploreri;
        this.cost = cost;
    }


    @Override
    public String getDescriere() {
        return "Cursul "+nume+" are nivelul de dificultate: "+dificultate;
    }

    @Override
    public String getDurata() {
        switch (dificultate.toLowerCase()){
            case("usor"):
                return "1 luna";
            case("mediu"):
                return "3 luni";
            case("dificil"):
                return "5 luni";
            default:
                return "necunoscut";
        }
    }

    public LinkedHashMap<String,Activity> getMateriale(){
        return materiale;
    }

    public void setMateriale(LinkedHashMap<String,Activity> materiale){
        this.materiale=materiale;
    }

    public int getCost() {
        return this.cost;
    }

    public int getCost(Persoana p){
        if(p instanceof Trainer) return 0;
        else{
            return this.cost;
        }
    }
}
