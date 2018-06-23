package classeBasica;
import exceptions.*;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private String endereco;

	public Pessoa(String nome, int idade, String cpf, String endereco) 
			throws CPFInvalidoException, PessoaMenorIdadeException{
		boolean valido = false;
		if (cpfValido(cpf)) {
			valido = true;
		} else {
			throw new CPFInvalidoException();
		}
		if (idade >= 18) {
			valido = true;
		} else {
			throw new PessoaMenorIdadeException();
		}
		if (valido) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
			this.endereco = endereco;
		}
	}

	public boolean cpfValido(String cpf) {
		boolean valido = false;
		if (cpf.length() == 11) {
			valido = true;
		}
		for (int i = 0; i < cpf.length(); i++) {
			if (cpf.charAt(i) >= 48 && cpf.charAt(i) <= 57) {
				valido = true;
			} else {
				valido = false;
				i = cpf.length();
			}
		}
		return valido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws CPFInvalidoException{
		if (cpfValido(cpf)) {
			this.cpf = cpf;
		} else {
			throw new CPFInvalidoException();
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
