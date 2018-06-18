
public class RepositorioConcessionariaArray implements RepositorioConcessionaria {
	private Concessionaria[] concessionarias;
	private int indice;

	public RepositorioConcessionariaArray(int tamanho) {
		concessionarias = new Concessionaria[tamanho];
	}

	public void inserir(Concessionaria concessionaria) {
		concessionarias[indice] = concessionaria;
		indice++;
	}

	public void atualizar(Concessionaria concessionaria) {
		boolean t = false;
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(concessionaria.getLocal())) {
				concessionarias[i] = concessionaria;
				t = true;
			}
		}
		if (!t) {
			// ERRO
		}
	}

	public void remover(String local) {
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(local)) {
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
	}

	public Concessionaria procurar(String local) {
		Concessionaria c = null ;
		for (int i = 0; i < indice; i++) {
			if (concessionarias[i].getLocal().equals(local)) {
				c = concessionarias[i] ;
			}
		}
		if (erro) {
			
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
