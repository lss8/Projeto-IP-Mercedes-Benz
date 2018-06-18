public interface RepositorioProduto {
	void inserir(Produto produto) ;
	Produto procurar(String tipo) 
		throws PNEExeception ;
	void atualizar(Produto produto)
		throws PNEExeception ;
	void remover(String tipo) 
		throws PNEExeception ;
	boolean existe(String tipo) ;
}