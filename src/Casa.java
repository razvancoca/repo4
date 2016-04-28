
public class Casa extends Imobil {

	@Override
	public void vinde() {
		System.out.println("Casa vanduta");
	}

	@Override
	public void inchiriaza() {
		System.out.println("Casa inchiriata");
	}

	@Override
	public void setStrategie(String tipTranzactie) {
		if(tipTranzactie.equals("vinde"))
			vinde();
		else inchiriaza();

	}

}
