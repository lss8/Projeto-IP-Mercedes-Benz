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
	
	public void remover(String modelo) {
		if (this.produto != null) {
			if (this.produto.getModelo().equals(modelo)) {
				this.produto = this.next.produto ;
				this.next = this.next.next ;
			}
			else {
				this.next.remover(modelo);
			}
		}
		else {
			//erro
		}
	}
	
	public Produto procurar(String modelo) {
		if (this.produto != null) {
			if (this.produto.getModelo().equals(modelo)) {
				return produto ;
			}
			else {
				this.next.procurar(modelo);
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
	
	public boolean existe(String modelo) {
		boolean n = false ;
		if (this.produto != null) {
			if (this.produto.getModelo().equals(modelo)) {
				n = true ;
			}
			else {
				this.next.existe(modelo);
			}
		}
		return n ;
	}
	
}