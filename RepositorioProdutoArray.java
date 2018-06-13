public class RepositorioProdutoArray implements RepositorioProduto {
	private Produto[] produtos ;
	private int indice ;
	
	public RepositorioProdutoArray(int tamanho) {
		produtos = new Produto[tamanho] ;
	}
	
	public void inserir(Produto produto) {
		produtos[indice] = produto ;
		indice++ ;
	}
	
	public void remover(String modelo) {
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(modelo)) {
				produtos[i] = null ;
				int j = i ;
				for (i=j;i<indice;i++) {
					if (i != indice-1) {
						produtos[i] = produtos[i+1] ;
					}
					else {
						produtos[i] = null ;
					}
				}
			}
		}
	}
	
	public Produto procurar(String modelo) {
		boolean v = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(modelo)) {
				v = true ;
				return produtos[i] ;
			}
		}
		if (!v) {
			//erro
		}
	}
	
	public void atualizar(Produto produto) {
		boolean t = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(produto.getModelo())) {
				produtos[i] = produto ;
				t = true ;
			}
		}
		if (!t) {
			//erro
		}
	}
	
	public boolean existe(String modelo) {
		boolean n = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(modelo)) {
				n = true ;
			}
		}
		return n ;
	}
	
}