package interfaces;
import classeBasica.*;
import exceptions.*;

public interface RepositorioPessoa {

	void inserir(Pessoa pessoa);
	
	Pessoa procurar(String cpf) throws PessoaNaoEncontradaException;
	
	void atualizar(Pessoa pessoa) throws PessoaNaoEncontradaException;
	
	void remover(String cpf) throws PessoaNaoEncontradaException;
	
	boolean existe(String cpf);
	
}
