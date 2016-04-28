
public class Program {
	public static void main(String [] args){
		AgentieImobiliara agentieImobiliara = AgentieImobiliara.getInstance();

		Imobil garsoniera = new ImobilFactory().getImobil("garsoniera");
		Imobil apartament = new ImobilFactory().getImobil("apartament");
		Imobil casa = new ImobilFactory().getImobil("casa");

		garsoniera.setStrategie("vinde");

		casa.setStrategie("inchiriaza");


	}
}
