package negocio;
import repositorio.*;
import interfaces.*;
import exceptions.*;
import classeBasica.*;

public class CadastroConcessionaria {
 private RepositorioConcessionaria concessionarias;
 
public  CadastroConcessionaria(char t) {
	if(t == 'a' || t== 'A') {
		this.concessionarias = new RepositorioConcessionariaArray();
	} else {
		this.concessionarias = new RepositorioConcessionariaLista();
	}

}
 public void cadastrar(Concessionaria concessionaria) throws ConcessionariaJaCadastradaException {
	 if(!(concessionarias.existe(concessionaria.getLocal()))) {
		 concessionarias.inserir(concessionaria);
	 } else {
		  throw new ConcessionariaJaCadastradaException();
	 }
 }
 public Concessionaria procurar(String local) throws ConcessionariaNaoEncontrdaException {
	return concessionarias.procurar(local);
 }
public void atualizar(Concessionaria concessionaria) throws ConcessionariaNaoEncontrdaException {
	 concessionarias.atualizar(concessionaria);
}
public void remover(String local) throws ConcessionariaNaoEncontrdaException {
	concessionarias.remover(local);
}
 
 
}
