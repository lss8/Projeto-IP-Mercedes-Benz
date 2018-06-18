
public class Funcionario extends Pessoa{
	
	private Concessionaria trabalho; 
	private double salario;
	
	public Funcionario() {
		super();
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
