package interfaces;
import classeBasica.*;

public interface RepositorioConcessionaria {

	 void inserir(Concessionaria concessionaria);

	 void atualizar(Concessionaria concessionaria) throws ConcessionariaNaoEncontrdaException;

	 void remover(String local) throws ConcessionariaNaoEncontrdaException;

	 Concessionaria procurar(String local) throws ConcessionariaNaoEncontrdaException;

	 boolean existe(String local);
}
