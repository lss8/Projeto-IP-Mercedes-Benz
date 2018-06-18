
public class CadastroPessoa {
	
	private RepositorioPessoa pessoas;
	
	public CadastroPessoa(RepositorioPessoaArray rpa) {
		pessoas = rpa;
	}
	
	public CadastroPessoa(RepositorioPessoaLista rpl) {
		pessoas = rpl;
	}
	
	public void inserir(Pessoa pessoa) {
		if(!(pessoas.existe(pessoa.getCpf()))) {
			pessoas.inserir(pessoa);
		}else {
			//erro
		}
	}
	
	public Pessoa procurar(String cpf) {
		if(pessoas.existe(cpf)) {
			return pessoas.procurar(cpf);
		}else {
			//erro
		}
	}
	
	public void Atualizar(Pessoa pessoa) {
		if(pessoas.existe(pessoa.getCpf())) {
			pessoas.atualizar(pessoa);
		}else {
			//erro
		}
	}
	
	public void remover(String cpf) {
		if (pessoas.existe(cpf)) {
			pessoas.remover(cpf);
		}else {
			//erro
		}
	}

}




