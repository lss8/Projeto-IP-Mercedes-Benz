
public class Concessionaria {
	private Produto produto;
	private Cliente cliente;
	private Funcionario funcionario;
	private String local;
	private int estoque;
	private String nome;

	Concessionaria() {
		this.produto = null;
		this.cliente = null;
		this.funcionario = null;
		this.local = null;
		this.estoque = 0;
		this.nome = null;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}