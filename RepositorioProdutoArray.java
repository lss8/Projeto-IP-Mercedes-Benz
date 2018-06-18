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
	
	public void remover(String tipo) throws PNEExeception {
		boolean achou = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getTipo().equals(tipo)) {
				achou = true ;
				produtos[i] = null ;
				int j = i ;
				for (i=j;i<indice;i++) {
					if (i != indice-1) {
						produtos[i] = produtos[i+1] ;
					}
					else {
						produtos[i] = null ;
						indice-- ;
					}
				}
			}
		}
		if (!achou) {
			throw new PNEExeception() ;
		}
	}
	
	public Produto procurar(String tipo) throws PNEExeception {
		boolean achou = false ;
		Produto p = null ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getTipo().equals(tipo)) {
				achou = true ;
				p = produtos[i] ;
			}
		}
		if (!achou) {
			throw new PNEExeception() ;
		}
		else {
			return p ;
		}
	}
	
	public void atualizar(Produto produto) throws PNEExeception {
		boolean achou = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getTipo().equals(produto.getTipo())) {
				produtos[i] = produto ;
				achou = true ;
			}
		}
		if (!achou) {
			throw new PNEExeception() ;
		}
	}
	
	public boolean existe(String tipo) {
		boolean achou = false ;
		for (int i=0;i<indice;i++) {
			if (produtos[i].getTipo().equals(tipo)) {
				achou = true ;
			}
		}
		return achou ;
	}
	
}