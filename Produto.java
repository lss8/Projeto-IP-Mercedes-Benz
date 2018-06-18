public class Produto {
	private String modelo ;
	private String cor ;
	private String tipo ;
	private double preco ;
	private double custof ;
	private Concessionaria concessionaria ;
	
	public Produto(String modelo, String cor, String tipo, double preco, double custof, Concessionaria concessionaria) {
		this.modelo = modelo ;
		this.cor = cor ;
		this.tipo = tipo ;
		this.preco = preco ;
		this.custof = custof ;
		this.concessionaria = concessionaria ;
	}
	
	public String getModelo() {
		return this.modelo ;
	}
	
	public String getTipo() {
		return this.tipo ;
	}
	
	public double getPreco() {
		return this.preco ;
	}
	
	public double getLucro() {
		return this.preco - this.custof ;
	}
	
	public double getCustof() {
		return this.custof ;
	}
	
	public int getEstoque() {
		return this.concessionaria.getEstoque() ;
	}
	
	public String getCor() {
		return this.cor ;
	}
	
	public String getConcessionaria() {
		return this.concessionaria.getLocal() ;
	}
	
}