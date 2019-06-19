
public class ValorEntrega implements Visitor{

	@Override
	public double visitor(Salgados salgados) {
		// TODO Auto-generated method stub
		return salgados.getValorEntrega()+ salgados.getValorPronta();
	}

}
