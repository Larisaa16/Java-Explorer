package main;

import Activities.Curs;
import Activities.Material;
import Activities.Rush;
import Activities.Tema;
import basic.Explorer;
import basic.Persoana;
import basic.Trainer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Persoana e1 = new Explorer("Mircea", "Ioana", "Timi", 21, false);
		Persoana t1 = new Trainer("Tudor", "Andrei", "Iasi", 34, true);
		System.out.println(e1 + e1.getResponsabilitati());
		System.out.println(t1 + t1.getResponsabilitati());
		System.out.println(e1.obtineIdentificator());
		System.out.println(t1.obtineIdentificator());

		Explorer e2 = new Explorer("Mihaila", "Eliza", "CLuj", 28, true);
		Explorer e3 = new Explorer("Ionescu", "Dani", "Bucuresti", 25, false);
		Trainer t2 = new Trainer("Duminica", "Mihaela", "Brasov", 26, true);
		ArrayList<Persoana> participanti = new ArrayList<>();
		participanti.add(e1);
		participanti.add(e2);
		participanti.add(e3);
		participanti.add(t2);

		Curs curs = new Curs("JAVA", "mediu", t1, participanti, 1000);

		for (Persoana p : participanti) {
			System.out.println(p.obtineIdentificator() + " pays " + curs.getCost(p));
		}

		curs.getMateriale().put("Rush1", new Rush());
		curs.getMateriale().put("Rush2", new Rush());
		curs.getMateriale().put("Tema1", new Tema());
		curs.getMateriale().put("Tema2", new Tema());
		curs.getMateriale().put("Material1", new Material());
		curs.getMateriale().put("Material2", new Material());

		for (String key : curs.getMateriale().keySet()) {
			System.out.println("Activitatea " + key + " este de tip " +
					curs.getMateriale().get(key).getClass().getSimpleName() +
					" cu descrierea \"" + curs.getMateriale().get(key).getDescriere() +
					"\" si durata estimata de " + curs.getMateriale().get(key).getDurata());
		}

	}
}



