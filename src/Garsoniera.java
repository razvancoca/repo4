
public class Garsoniera extends Imobil {

	@Override
	public void vinde() {
		System.out.println("Garsoniera vanduta");

	}

	@Override
	public void inchiriaza() {
		System.out.println("Garsoniera inchiriata");
	}

	@Override
	public void setStrategie(String tipTranzactie) {
		if(tipTranzactie.equals("vinde"))
			vinde();
		else inchiriaza();
	}

}
