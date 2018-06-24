package classeBasica;
import interfaces.*;
import exceptions.*;

public class Concessionaria {
	private Produto produto;
	private RepositorioPessoa clientes;
	private RepositorioPessoa funcionarios;
	private String local;
	private int estoque;
	private int venda;

	Concessionaria(Produto produto, RepositorioPessoa clientes, RepositorioPessoa funcionarios, String local,
			int estoque, int venda) {
		this.produto = produto;
		this.clientes = clientes;
		this.funcionarios = funcionarios;
		this.local = local;
		this.estoque = estoque;
		this.venda =venda;
	}
	

	public void setLocal(String local) {
		this.local = local;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public void setClientes(RepositorioPessoa clientes) {
		this.clientes = clientes;
	}


	public void setFuncionarios(RepositorioPessoa funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public void setVenda(int venda) {
		this.venda = venda;
	}


	public int getVenda() throws ConcessionariaEstoqueNegativoException {
		if (estoque > 0) {
			return this.venda;
		} else {
			throw new ConcessionariaEstoqueNegativoException();
		}
	}

	public int getEstoque() throws ConcessionariaEstoqueNegativoException {
		if (estoque > 0) {
			return this.estoque;
		} else {
			throw new ConcessionariaEstoqueNegativoException();
		}
	}

	public String getLocal() {
		return this.local;
	}

	public RepositorioPessoa getFuncionarios() {
		return this.funcionarios;
	}

	public RepositorioPessoa getClientes() {
		return this.clientes;
	}

	public Produto getProduto() {
		return this.produto;
	}

}