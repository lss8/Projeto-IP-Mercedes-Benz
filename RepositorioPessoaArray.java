
public class RepositorioPessoaArray implements RepositorioPessoa{
	
	private Pessoa[] pessoas;
	private int indice;
	
	public RepositorioPessoaArray(int tamanho) {
		pessoas = new Pessoa[tamanho];
		indice = 0;
	}
	
	public void inserir(Pessoa pessoa) {
		this.pessoas[indice] = pessoa;
		indice++;
	}
	
	public Pessoa procurar(String cpf) {
		for(int i = 0; i < indice; i++) {
			if(pessoas[i].getCpf().equals(cpf)) {
				return pessoas[i];
			}
		}
		//erro
	}
	
	public void atualizar(Pessoa pessoa) {
		boolean achou = false;
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(pessoa.getCpf())) {
				pessoas[i] = pessoa;
				achou = true;
			}
		}
		if (!achou) {
			//erro
		}
	}
	
	public void remover(String cpf) {
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
			//erro
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
