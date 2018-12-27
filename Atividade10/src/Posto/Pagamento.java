package Posto;

public class Pagamento {
	
	
	public double calcularValor(Litro litro) {		
		return (litro.getCombustivel().getTipoCombustivel().getValor()*litro.getLitro()+litro.getCombustivel().getTipoCombustivel().getTributacao()) - (litro.getCombustivel().getTipoCombustivel().getValor()*litro.getLitro()+litro.getCombustivel().getTipoCombustivel().getTributacao())*litro.getDesconto()/100;
	}
	public double calcularLoja(Item item) {
		return (item.getLojaConveniencia().getTipoConveniencia().getValor()*item.getItem()+item.getLojaConveniencia().getTipoConveniencia().getTributacao())-(item.getLojaConveniencia().getTipoConveniencia().getValor()*item.getItem()+item.getLojaConveniencia().getTipoConveniencia().getTributacao())*item.getDesconto()/100;
	}
	public double totalPagar(double ...totalpagar) {
		double total = 0;
		for (double  d : totalpagar) {
			total += d; 
		}
		
		return total;
	}	
	
	
	
	
}
