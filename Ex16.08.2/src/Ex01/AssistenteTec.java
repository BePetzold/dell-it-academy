package Ex01;

public class AssistenteTec extends Assistente {
	private boolean turnoNoite;

	public boolean getTurnoNoite() {
		return turnoNoite;
	}

	public void setTurnoNoite(boolean turnoNoite) {
		this.turnoNoite = turnoNoite;
	}
	
	public void adicionalNoturno() {
		if (turnoNoite == true) {
		super.setSalario(super.getSalario()+200);
		}
	}
	
	
	
	
}
