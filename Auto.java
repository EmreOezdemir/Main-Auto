
public class Auto {

	private int reifen;
	private double preis;
	private String marke;

	public int getReifen() {
		return reifen;
	}

	public void setReifen(int reifen) {
		this.reifen = reifen;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public Auto() {

	}

	public Auto(int reifen, double preis, String marke) {

		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;

	}

	public void gibtgas() {

		System.out.println("Das Auto mit der Marke " + this.marke + " fährt jetzt los");

	}

	public void bremse() {

		System.out.println("Das Auto mit der Marke " + this.marke + " bremst");

	}

}
