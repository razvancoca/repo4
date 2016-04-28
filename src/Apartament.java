
public class Apartament extends Imobil {


	@Override
	public void vinde() {
		System.out.println("Apartament vandut");
	}

	//adsa

	@Override
	public void inchiriaza() {
		System.out.println("Apartament inchiriat");
	}

	@Override
	public void setStrategie(String tipTranzactie) {
		if(tipTranzactie.equals("vinde"))
			vinde();
		else inchiriaza();
	}

}
