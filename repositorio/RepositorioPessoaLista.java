package repositorio;
import classeBasica.*;
import interfaces.*;
import exceptions.*;

public class RepositorioPessoaLista implements RepositorioPessoa {

	private Pessoa pessoa;
	private RepositorioPessoaLista next;

	public RepositorioPessoaLista() {
		pessoa = null;
		next = null;
	}

	public void inserir(Pessoa pessoa) {
		if (this.pessoa == null) {
			this.pessoa = pessoa;
			next = new RepositorioPessoaLista();
		} else {
			this.next.inserir(pessoa);
		}
	}

	public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException {
		Pessoa pessoa = null;
		if (this.pessoa != null) {
			if (this.pessoa.getCpf().equals(cpf)) {
				pessoa = this.pessoa;
			} else {
				this.next.procurar(cpf);
			}
		}
		if (pessoa == null) {
			throw new PessoaNaoEncontradaException();
		} else {
			return pessoa;
		}
	}

	public void atualizar(Pessoa pessoa) throws PessoaNaoEncontradaException {
		if (this.pessoa != null) {
			if (this.pessoa.getCpf().equals(pessoa.getCpf())) {
				this.pessoa = pessoa;
			} else {
				this.next.atualizar(pessoa);
			}
		} else {
			 throw new PessoaNaoEncontradaException();
		}
	}

	public void remover(String cpf) throws PessoaNaoEncontradaException {
		if (this.pessoa != null) {
			if (this.pessoa.getCpf().equals(cpf)) {
				this.pessoa = this.next.pessoa;
				this.next = this.next.next;
			} else {
				this.next.remover(cpf);
			}
		} else {
			 throw new PessoaNaoEncontradaException();
		}
	}

	public boolean existe(String cpf) {
		boolean achou = false;
		if (this.pessoa.getCpf().equals(cpf)) {
			achou = true;
		} else {
			this.next.existe(cpf);
		}
		return achou;
	}

}