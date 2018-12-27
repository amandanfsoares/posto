package Posto;

public class LojaConveniencia {
	
	
	private TipoConveniencia tipoConveniencia;
	
	public TipoConveniencia getTipoConveniencia() {
		return tipoConveniencia; 
	}

	public void setTipoconveniencia(TipoConveniencia tipoConveniencia) {
		this.tipoConveniencia = tipoConveniencia;
	}

	public LojaConveniencia ( TipoConveniencia tipoConveniencia) {
		this.tipoConveniencia = tipoConveniencia;
	}

	@Override
	public String toString() {
		return  "		tipoConveniencia=" + tipoConveniencia;
	}
	
}
	
