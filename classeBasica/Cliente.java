package classeBasica;
import exceptions.*;

public class Cliente extends Pessoa{
	
	private Concessionaria socio;
	
	public Cliente(String nome, int idade, String cpf, String endereco) 
			throws CPFInvalidoException, PessoaMenorIdadeException{
		super(nome, idade, cpf, endereco);
		socio = null;
	}

	public Concessionaria getSocio() {
		return socio;
	}

	public void setSocio(Concessionaria socio) {
		this.socio = socio;
	}
	
}
