
public class RepositorioProdutoArray implements RepositorioProduto {
	private Produto[] produtos ;
	private int i ;
	
	public RepositorioProdutoArray(int tamanho) {
		produtos = new Produto[tamanho] ;
	}
	
	public void inserir(Produto produto) {
		produtos[i] = produto ;
		i++ ;
	}
	
	public void remover(Produto produto) {
		
	}
	
	public Produto procurar(Produto produto) {
		
	}
	
	public void atualizar(Produto produto) {
		
	}
	
}
