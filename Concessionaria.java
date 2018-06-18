
public class Concessionaria {
	private Produto produto;
	private RepositorioPessoa clientes;
	private RepositorioPessoa funcionarios;
	private String local;
	private int estoque;

	Concessionaria(Produto produto, RepositorioPessoa clientes, RepositorioPessoa funcionarios, String local, int estoque) {
		this.produto = produto;
		this.clientes = clientes;
		this.funcionarios = funcionarios;
		this.local = local;
		this.estoque = estoque;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public String getLocal() {
		return this.local;
	}

	public Funcionario getFuncionarios() {
		return this.funcionarios;
	}
	public Cliente getClientes() {
		return this.clientes;
	}


	public Produto getProduto() {
		return this.produto;
	}

}