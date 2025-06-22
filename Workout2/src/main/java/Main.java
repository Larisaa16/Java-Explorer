

public class Main {
	public static void main(String[] args) {
		Persoana.curs = "JAVA";
		Persoana persoana=new Persoana("Popescu", "Ion-Andrei","Cluj",40,true);
		System.out.println();
		System.out.println(persoana);

		Persoana persoana1=new Persoana();
		System.out.println(persoana1);

		persoana1.setNume("Popescu");
		persoana1.setPrenume("Marisa");
		persoana1.setOras("Cluj");
		persoana1.setVarsta(25);
		persoana1.setCasatorita(true);

		persoana1.creste();
		System.out.println(persoana1);

		System.out.println(persoana1.obtineIdentificator());

		
	}

}
