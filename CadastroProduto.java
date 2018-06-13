
public class CadastroProduto {
	private RepositorioProduto produtos ;
	
	public CadastroProduto(RepositorioProdutoArray rpa) {
		produtos = rpa ;
	}
	
	public CadastroProduto(RepositorioProdutoLista rpl) {
		produtos = rpl ;
	}
	
	public void inserir(Produto produto) {
		if (!produtos.existe(produto)) {
			produtos.inserir(produto);
		}
		else {
			//erro
		}
	}
	
	public void remover(String modelo) {
		if (produtos.existe(modelo)) {
			produtos.remover(modelo);
		}
		else {
			//erro
		}
	}
	
	public void atualizar(Produto produto) {
		if (produtos.existe(produto)) {
			produtos.atualizar(produto);
		}
		else {
			//erro
		}
	}
	
	public Produto procurar(String modelo) {
		if (produtos.existe(modelo)) {
			return produtos.procurar(modelo) ;
		}
		else {
			//erro
		}
	}
}
