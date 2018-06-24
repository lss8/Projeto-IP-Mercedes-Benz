package repositorio;
import classeBasica.*;
import interfaces.*;
import negocio.*;

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

	public void atualizar(Concessionaria concessionaria) throws ConcessionariaNaoEncontradaException {
		if (this.concessionaria != null) {
			if (concessionaria.equals(this.concessionaria)) {
				this.concessionaria = concessionaria;
			} else {
				this.next.atualizar(concessionaria);
			}
		} else {
			throw new ConcessionariaNaoEncontradaException();
		}
	}

	public void remover(String local) throws ConcessionariaNaoEncontradaException {
		if (this.concessionaria != null) {
			if (local.equals(concessionaria.getLocal())) {
				this.concessionaria = this.next.concessionaria;
				this.next = this.next.next;
			} else {
				this.next.remover(local);
			}
		} else {
			throw new ConcessionariaNaoEncontradaException();
		}

	}

	public Concessionaria procurar(String local) throws ConcessionariaNaoEncontradaException {
		Concessionaria concessionaria = null; 
		if (this.concessionaria != null) {
			if (local.equals(concessionaria.getLocal())) {
				concessionaria = this.concessionaria;
			} else {
				this.next.procurar(local);
			}
		} if (concessionaria == null) {
			 throw new  ConcessionariaNaoEncontradaException();
		} 
			return concessionaria;
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
