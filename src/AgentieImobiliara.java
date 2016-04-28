
public class AgentieImobiliara {
	private static AgentieImobiliara singleton;

	private AgentieImobiliara() {
	}

	public static AgentieImobiliara getInstance() {
		if (singleton == null)
			singleton = new AgentieImobiliara();
		return singleton;
	}

}
