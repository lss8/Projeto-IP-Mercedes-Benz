
public interface RepositorioPessoa {

	void inserir(Pessoa pessoa);
	
	Pessoa procurar(String cpf);
	
	void atualizar(Pessoa pessoa);
	
	void remover(String cpf);
	
	boolean existe(String cpf);
	
}
