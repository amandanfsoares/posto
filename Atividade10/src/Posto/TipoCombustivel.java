package Posto;

public enum TipoCombustivel {

	ALCOOL("alcool",2.60,1.5),GASOLINA_COMUM("gasolinaComum",2.90,2.3),GASOLINA_ADITIVADA("gasolinaAditivada",3.10,2.7),GAS_GNV("gas",2.50,1.2);
	
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
	
	private TipoCombustivel(String nome, double valor, double tributacao) {
		this.nome=nome;
		this.valor=valor;
		this.tributacao=tributacao;
		
	}
	

}
