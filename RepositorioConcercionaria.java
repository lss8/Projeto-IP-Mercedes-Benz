
public interface RepositorioConcercionaria {

	void inserir(Concessionaria concessionaria);

	void atualizar(Concessionaria concessionaria);

	void remover(String nome);

	Concessionaria procurar(String nome);

	boolean existe(String nome);
}
