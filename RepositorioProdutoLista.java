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
	
	public void remover(String tipo) throws ProdutoNaoEncontradoException {
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				this.produto = this.next.produto ;
				this.next = this.next.next ;
			}
			else {
				this.next.remover(tipo) ;
			}
		}
		else {
			throw new ProdutoNaoEncontradoException() ;
		}
	}
	
	public Produto procurar(String tipo) throws ProdutoNaoEncontradoException {
		Produto p = null ;
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				p = this.produto ;
			}
			else {
				this.next.procurar(tipo);
			}
		}
		if(p != null) {
			return p ;
		}
		else {
			throw new ProdutoNaoEncontradoException() ;
		}
	}
	
	public void atualizar(Produto produto) throws ProdutoNaoEncontradoException {
		if (this.produto != null) {
			if (this.produto.getTipo().equals(produto.getTipo())) {
				this.produto = produto ;
			}
			else {
				this.next.atualizar(produto);
			}
		}
		else {
			throw new ProdutoNaoEncontradoException() ;
		}
	}
	
	public boolean existe(String tipo) {
		boolean achou = false ;
		if (this.produto != null) {
			if (this.produto.getTipo().equals(tipo)) {
				achou = true ;
			}
			else {
				this.next.existe(tipo);
			}
		}
		return achou ;
	}
	
}