
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

	public void remover(String nome) {
		if (this.concessionaria != null) {
			if (nome.equals(concessionaria.getNome())) {
				this.concessionaria = this.next.concessionaria;
				this.next = this.next.next;
			} else {
				this.next.remover(nome);
			}
		} else {
			// ERRO
		}

	}

	public Concessionaria procurar(String nome) {
		if (this.concessionaria != null) {
			if (nome.equals(concessionaria.getNome())) {
				return concessionaria;
			} else {
				this.next.procurar(nome);
			}
		} else {
			// ERRO
		}
	}

	public boolean existe(String nome) {
		boolean n = true;
		if (nome.equals(concessionaria.getNome())) {
			n = true;
		} else if (!(nome.equals(concessionaria.getNome()))) {
			this.next.existe(nome);
		} else {
			n = false;
		}
		return n;
	}
}
