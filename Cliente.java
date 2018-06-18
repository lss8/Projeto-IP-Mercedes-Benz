
public class Cliente extends Pessoa{
	
	private Concessionaria socio;
	
	public Cliente() {
		super();
		socio = null;
	}

	public Concessionaria getSocio() {
		return socio;
	}

	public void setSocio(Concessionaria socio) {
		this.socio = socio;
	}
	
}
