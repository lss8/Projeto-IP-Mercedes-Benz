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
	
	public void remover(String tipo) {
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				this.produto = this.next.produto ;
				this.next = this.next.next ;
			}
			else {
				this.next.remover(tipo);
			}
		}
		else {
			//erro
		}
	}
	
	public Produto procurar(String tipo) {
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				return produto ;
			}
			else {
				this.next.procurar(tipo);
			}
		}
		else {
			//erro
		}
	}
	
	public void atualizar(Produto produto) {
		if (this.produto != null) {
			if (this.produto.getTipo().equals(produto.getTipo())) {
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
	
	public boolean existe(String tipo) {
		boolean n = false ;
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				n = true ;
			}
			else {
				this.next.existe(tipo);
			}
		}
		return n ;
	}
	
}