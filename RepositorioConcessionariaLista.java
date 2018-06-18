
public class RepositorioConcessionariaLista implements RepositorioConcessionaria {
	private Concessionaria concessionaria;
	private RepositorioConcessionariaLista next;

	public RepositorioConcessionariaLista() {
		this.concessionaria = null;
		this.next = null;
	}

	public void inserir(Concessionaria concessionaria) {
		if (this.concessionaria == null) {
			this.concessionaria = concessionaria;
			this.next = new RepositorioConcessionariaLista();
		} else {
			this.next.inserir(concessionaria);
		}
	}

	public void atualizar(Concessionaria concessionaria) {
		if (this.concessionaria != null && concessionaria.equals(this.concessionaria)) {
			this.concessionaria = concessionaria;
		} else {
			this.next.atualizar(concessionaria);
		}
	}

	public void remover(String local) {
		if (this.concessionaria != null) {
			if (local.equals(concessionaria.getLocal())) {
				this.concessionaria = this.next.concessionaria;
				this.next = this.next.next;
			} else {
				this.next.remover(local);
			}
		} else {
			// ERRO
		}

	}

	public Concessionaria procurar(String local) {
		if (this.concessionaria != null) {
			if (local.equals(concessionaria.getLocal())) {
				return concessionaria;
			} else {
				this.next.procurar(local);
			}
		} else {
			// ERRO
		}
	}

	public boolean existe(String local) {
		boolean n = true;
		if (local.equals(concessionaria.getLocal())) {
			n = true;
		} else if (!(local.equals(concessionaria.getLocal()))) {
			this.next.existe(local);
		} else {
			n = false;
		}
		return n;
	}
}
