
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salgados coxinha = new Salgados("Coxinha",1.0,0.2,0.5);
		
		ValorCongelado desconto = new ValorCongelado();
		ValorPronta taNaMesa = new ValorPronta();
		ValorEntrega CoxinhasDelivery = new ValorEntrega();
		ValorCongeladoDelivery fritarNaCasaDoCrush = new ValorCongeladoDelivery();
		
		System.out.println("Valor da Coxinha Pronta "+coxinha.accept(taNaMesa));
		System.out.println("Valor da Coxinha Congelada "+coxinha.accept(desconto));
		System.out.println("Valor da Coxinha na sua casa (Delevery) "+coxinha.accept(CoxinhasDelivery));
		System.out.println("Valor da Coxinha Congelada na sua Casa "+coxinha.accept(fritarNaCasaDoCrush));
		
		

	}

}
