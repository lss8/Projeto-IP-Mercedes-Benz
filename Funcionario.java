
public class Funcionario extends Pessoa{
	
	private Concessionaria trabalho; 
	private double salario;
	
	public Funcionario(String nome, int idade, String cpf, String endereco) 
			throws CPFInvalidoException, PessoaMenorIdadeException{
		super(nome, idade, cpf, endereco);
		salario  = 0; 
	}
	
	public Concessionaria getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Concessionaria trabalho) {
		this.trabalho = trabalho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
