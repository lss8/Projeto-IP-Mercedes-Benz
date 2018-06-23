
public class RepositorioPessoaArray implements RepositorioPessoa {

	private Pessoa[] pessoas;
	private int indice;

	public RepositorioPessoaArray() {
		pessoas = new Pessoa[100];
		indice = 0;
	}

	public void inserir(Pessoa pessoa) {
		if (indice < 100) {
			this.pessoas[indice] = pessoa;
			indice++;
		}else {
			
		}
	}

	public Pessoa procurar(String cpf) throws PessoaNaoEncontradaException {
		Pessoa pessoa = null;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(cpf)) {
				pessoa = pessoas[i];
			}
		}
		if (pessoa != null) {
			return pessoa;
		} else {
			throw new PessoaNaoEncontradaException();
		}
	}

	public void atualizar(Pessoa pessoa) throws PessoaNaoEncontradaException {
		boolean achou = false;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(pessoa.getCpf())) {
				pessoas[i] = pessoa;
				achou = true;
			}
		}
		if (!achou) {
			throw new PessoaNaoEncontradaException();
		}
	}

	public void remover(String cpf) throws PessoaNaoEncontradaException {
		boolean achou = false;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(cpf)) {
				indice--;
				pessoas[i] = pessoas[indice];
				pessoas[indice] = null;
				achou = true;
			}
		}
		if (!achou) {
			throw new PessoaNaoEncontradaException();
		}
	}

	public boolean existe(String cpf) {
		boolean achou = false;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(cpf)) {
				achou = true;
			}
		}
		return achou;
	}

}
