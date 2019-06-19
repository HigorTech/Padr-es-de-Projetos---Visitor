
public class ValorCongeladoDelivery implements Visitor{

	@Override
	public double visitor(Salgados salgados) {
		// TODO Auto-generated method stub
		return salgados.getValorPronta() - salgados.getValorCongelado() + salgados.getValorEntrega();
	}

}
