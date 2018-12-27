package Posto;

public enum TipoConveniencia {
	
	BEBIDA("bebida",1.50,0.2), LANCHES("lanche",3.50,0.6), ACESSORIOS("acessorio",4.50,0.6), OUTROS("outros",3.50,0.2), OLEO("oleo",4.60,0.7), LIMPA_VIDRO("limpaVidro",4.60,0.5), ESPONJA("esponja",1.60,0.4), CHEIRINHO("cheirinho",4.60,0.9) ;
	
	
	private String nome;
	private double valor; 
	private double tributacao;
	
	public double getTributacao() {
		return tributacao;
	}
	public void setTributacao(double tributacao) {
		this.tributacao = tributacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private TipoConveniencia(String nome, double valor,double tributacao) {
		this.nome=nome;
		this.valor=valor;
		this.tributacao=tributacao;
		
	}
	

}
