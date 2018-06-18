
public interface RepositorioConcessionaria {

	 void inserir(Concessionaria concessionaria);

	 void atualizar(Concessionaria concessionaria);

	 void remover(String local);

	 Concessionaria procurar(String local);

	 boolean existe(String local);
}
