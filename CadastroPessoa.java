
public class CadastroPessoa {

	private RepositorioPessoa pessoas;

	public CadastroPessoa(char tipo) {
		if (tipo == 'a' || tipo == 'A') {
			this.pessoas = new RepositorioPessoaArray();
		}else {
			this.pessoas = new RepositorioPessoaLista();
		}
	}

	public void cadastrar(Pessoa pessoa) throws PessoaJaCadastradaException {
		if (!(pessoas.existe(pessoa.getCpf()))) {
			pessoas.inserir(pessoa);
		} else {
			throw new PessoaJaCadastradaException();
		}
	}

	public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException {
		return pessoas.procurar(cpf);
	}

	public void Atualizar(Pessoa pessoa) throws PessoaNaoEncontradaException {
		pessoas.atualizar(pessoa);
	}

	public void remover(String cpf) throws PessoaNaoEncontradaException {
		pessoas.remover(cpf);
	}

}
