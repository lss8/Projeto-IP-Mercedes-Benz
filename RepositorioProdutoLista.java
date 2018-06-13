public class RepositorioProdutoLista implements RepositorioProduto {
	private Produto produto ;
	private RepositorioProdutoLista next ;
	
	public RepositorioProdutoLista() {
		this.produto = null ;
		this.next = null ;
	}
	
	public void inserir(Produto produto) {
		if (this.produto == null) {
			this.produto = produto ;
			this.next = new RepositorioProdutoLista() ;
		}
		else {
			this.next.inserir(produto) ;
		}
	}
	
	public void remover(Produto produto) {
		if (this.produto != null) {
			if (this.produto.getModelo().equals(produto.getModelo())) {
				this.produto = this.next.produto ;
				this.next = this.next.next ;
			}
			else {
				this.next.remover(produto);
			}
		}
		else {
			//erro
		}
	}
	
	public Produto procurar(Produto produto) {
		if (this.produto != null) {
			if (this.produto.getModelo().equals(produto.getModelo())) {
				return produto ;
			}
			else {
				this.next.procurar(produto);
			}
		}
		else {
			//erro
		}
	}
	
	public void atualizar(Produto produto) {
		if (this.produto != null) {
			if (this.produto.getModelo().equals(produto.getModelo())) {
				this.produto = produto ;
			}
			else {
				this.next.atualizar(produto);
			}
		}
		else {
			//erro 
		}
	}
	
}