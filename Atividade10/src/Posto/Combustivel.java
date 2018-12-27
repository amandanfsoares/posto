package Posto;

public class Combustivel {

	
	private TipoCombustivel tipoCombustivel;	

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public Combustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		return  "		tipoCombustivel=" + tipoCombustivel;
	}
}
