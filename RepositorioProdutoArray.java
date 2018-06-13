
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
	
	public void remover(Produto produto) {
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(produto.getModelo())) {
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
	
	public Produto procurar(Produto produto) {
		boolean v = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getModelo().equals(produto.getModelo())) {
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
				v = true ;
			}
		}
		if (!t) {
			//erro
		}
	}
	
}