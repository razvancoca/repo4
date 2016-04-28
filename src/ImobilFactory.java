
public class ImobilFactory {
	public Imobil getImobil(String tipImobil) {
		if (tipImobil.equals("apartament"))
			return new Apartament();
		else if (tipImobil.equals("casa"))
			return new Casa();
		else if (tipImobil.equals("garsoniera"))
			return new Garsoniera();
		return null;
	}
}
