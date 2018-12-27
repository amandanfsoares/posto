package Posto;

public class Main{
	

		public static void main(String[] args) {
	
			LojaConveniencia acessorio = new LojaConveniencia(TipoConveniencia.ACESSORIOS);
			LojaConveniencia bebida = new LojaConveniencia(TipoConveniencia.BEBIDA);
			Combustivel alcool =new Combustivel(TipoCombustivel.ALCOOL);
		Item item1 = new Item(5, acessorio,0); 
		Item item2 =  new Item(4, bebida,0);
		Litro litro1 = new Litro(2.5 ,alcool,(double) 5);
		
		System.out.println(item1);
		System.out.println(item2);
		System.out.println("Total de itens da loja = "+Item.getTotalQtd());
		System.out.println(litro1);
		Pagamento pag = new Pagamento();
			System.out.println("\nValor a pagar: " +pag.totalPagar(pag.calcularValor(litro1), pag.calcularLoja(item2),
				pag.calcularLoja(item2)));
		
		
		
	}



	

}
