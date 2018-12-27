package Posto;

public class Item {
	
	
	private Integer quantidade;
	private LojaConveniencia lojaConveniencia;
	private static int totalQtd=0;
	private double desconto;
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public LojaConveniencia getLojaConveniencia() {
		return lojaConveniencia;
	}
	public void setLojaConveniencia(LojaConveniencia lojaConveniencia) {
		this.lojaConveniencia = lojaConveniencia;
	}
	public Integer getItem() {
		return quantidade;
	}
	public void setItem(Integer quantidade) {
		this.quantidade = quantidade;
	}

	
	public Item (Integer quantidade, LojaConveniencia lojaConveniencia,double desconto) {
		this.quantidade = quantidade;
		this.lojaConveniencia = lojaConveniencia;
		totalQtd += quantidade;
		this.desconto=desconto;
		}
	
	@Override
	public String toString() {
		
		return "Quantidade = " + quantidade+ "" + lojaConveniencia+" 	Desconto = "+desconto;
	}
	
	
	public static int getTotalQtd() {
		return totalQtd;
	}
	

	
}
