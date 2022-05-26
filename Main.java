
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto bmw = new Auto(); // Variante 1

		bmw.setReifen(4);
		bmw.setPreis(6000);
		bmw.setMarke("BMW");

		bmw.gibtgas();
		bmw.bremse();

		System.out.println("Das Auto mit der Marke " + bmw.getMarke() + " hat denn Preis " + bmw.getPreis());

		Auto audi = new Auto();

		audi.setReifen(4);
		audi.setPreis(9000);
		audi.setMarke("AUDI");

		audi.gibtgas();
		audi.bremse();

		System.out.println("Das Auto mit der Marke " + audi.getMarke() + " hat denn Preis " + audi.getPreis());

		Auto vw = new Auto(8, 5000, "VW"); // Variante 2

		vw.gibtgas();
		vw.bremse();

		System.out.println("Das Auto wird mit der Marke " + vw.getMarke() + " hat denn Preis " + vw.getPreis()
				+ " und ist " + vw.getReifen() + " -fach bereift");

	}

}
