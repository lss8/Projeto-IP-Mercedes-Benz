package negocio;
import repositorio.*;
import interfaces.*;
import classeBasica.*;
import exceptions.*;

public class CadastroProduto {
	private RepositorioProduto produtos ;
	
	public CadastroProduto(char tipo) {
		if ((tipo == 'a') || (tipo == 'A')) {
			produtos = new RepositorioProdutoArray()  ;
		}
		else {
			produtos = new RepositorioProdutoLista() ;
		}	
	}
	
	public CadastroProduto(RepositorioProdutoLista rpl) {
		
	}
	
	public void cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (!produtos.existe(produto.getTipo())) {
			produtos.inserir(produto);
		}
		else {
			throw new ProdutoJaCadastradoException() ;
		}
	}
	
	public void remover(String tipo) throws ProdutoNaoEncontradoException {
		produtos.remover(tipo);
	}
	
	public void atualizar(Produto produto) throws ProdutoNaoEncontradoException {
		produtos.atualizar(produto);
	}
	
	public Produto procurar(String tipo) throws ProdutoNaoEncontradoException {
		return produtos.procurar(tipo) ;
	}
}