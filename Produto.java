
public class Produto {
	private String modelo ;
	private String cor ;
	private double preco ;
	private double custof ;
	private Concessionaria concessionaria ;
	
	public Produto() {
		this.modelo = null ;
		this.cor = null ;
		this.preco = 0.0 ;
		this.custof = 0.0 ;
		this.concessionaria = null ;
	}
	
	public String getModelo() {
		return this.modelo ;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo ;
	}
	
	public double getPreco() {
		return this.preco ;
	}
	
	public void setPreco (double preco) {
		this.preco = preco ;
	}
	
	public double getLucro() {
		return this.preco - this.custof ;
	}
	
	public double getCustof() {
		return this.custof ;
	}
	
	public void setCustof (double custof) {
		this.custof = custof ;
	}
	
	public int getEstoque() {
		return this.concessionaria.getEstoque() ;
	}
	
	public String getCor() {
		return this.cor ;
	}
	
	public void setCor(String cor) {
		this.cor = cor ;
	}
	
	public String getConcessionaria() {
		return this.concessionaria.getLocal() ;
	}
	
	public void setConcessionaria (Concessionaria concessionaria) {
		this.concessionaria = concessionaria ;
	}
	
}