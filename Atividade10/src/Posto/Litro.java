package Posto;

public class Litro {
	
	private Double litro;
	private Combustivel combustivel;
	private double desconto;
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Double getLitro() {
		return litro;
	}
	public void setLitro(Double litro) {
		this.litro = litro;
	}
	
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setTipoCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	public Litro( Double litro, Combustivel combustivel,Double desconto) {
		this.litro = litro;
		this.combustivel = combustivel;
		
		this.desconto=desconto;
	}
	@Override
	public String toString() {
		return "Litro = " + litro +  "" + combustivel+"     	Desconto = "+desconto;
	}
	
	
	
}
