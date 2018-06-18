public class CadastroProduto {
	private RepositorioProduto produtos ;
	
	public CadastroProduto(RepositorioProdutoArray rpa) {
		produtos = rpa ;
	}
	
	public CadastroProduto(RepositorioProdutoLista rpl) {
		produtos = rpl ;
	}
	
	public void inserir(Produto produto) {
		if (!produtos.existe(produto.getTipo())) {
			produtos.inserir(produto);
		}
		else {
			//erro
		}
	}
	
	public void remover(String tipo) {
		if (produtos.existe(tipo)) {
			produtos.remover(tipo);
		}
		else {
			//erro
		}
	}
	
	public void atualizar(Produto produto) {
		if (produtos.existe(produto.getTipo())) {
			produtos.atualizar(produto);
		}
		else {
			//erro
		}
	}
	
	public Produto procurar(String tipo) {
		if (produtos.existe(tipo)) {
			return produtos.procurar(tipo) ;
		}
		else {
			//erro
		}
	}
}