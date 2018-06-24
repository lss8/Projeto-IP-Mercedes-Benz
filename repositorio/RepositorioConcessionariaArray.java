package repositorio;
import classeBasica.*;
import interfaces.*;
import exceptions.*;
public class RepositorioConcessionariaArray implements RepositorioConcessionaria {
	private Concessionaria[] concessionarias;
	private int indice;

	public RepositorioConcessionariaArray() {
		concessionarias = new Concessionaria[30];
	}

	public void inserir(Concessionaria concessionaria) {
		concessionarias[indice] = concessionaria;
		indice++;
	}
 
	public void atualizar(Concessionaria concessionaria) throws ConcessionariaNaoEncontradaException {
		boolean t = false;
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(concessionaria.getLocal())) {
				concessionarias[i] = concessionaria;
				t = true;
			}
		}
		if (!t) {
			throw new ConcessionariaNaoEncontradaException();
		}
	}

	public void remover(String local) throws ConcessionariaNaoEncontradaException {
		boolean t = false;
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(local)) {
				t = true;
				concessionarias[i] = null;
				int j = i;
				for (i = j; i < indice; i++) {
					if (i != indice - 1) {
						concessionarias[i] = concessionarias[i + 1];
					} else {
						concessionarias[i] = null;
					}
				}
			}
		}
		if(!t) {
			throw new ConcessionariaNaoEncontradaException();
		}
	}

	public Concessionaria procurar(String local) throws ConcessionariaNaoEncontradaException {
		Concessionaria c = null ;
		
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(local)) {
				c = concessionarias[i] ;
			}
		}
		if (c == null) {
			throw new ConcessionariaNaoEncontradaException();
		}
		else {
			return c;
		}
	}

	public boolean existe(String local) {
		boolean n = false;
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(local)) {
				n = true;
			} else {
				n = false;
			}
		}
		return n;
	}
}
