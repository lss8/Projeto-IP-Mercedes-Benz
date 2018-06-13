public interface RepositorioProduto {
	public void inserir(Produto produto) ;
	public Produto procurar(String modelo) ;
	public void atualizar(Produto produto) ;
	public void remover(String modelo) ;
	public boolean existe(String modelo) ;
}
