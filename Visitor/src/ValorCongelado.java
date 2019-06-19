
public class ValorCongelado implements Visitor {

	@Override
	public double visitor(Salgados salgados) {
		// TODO Auto-generated method stub
		return salgados.getValorPronta() - salgados.getValorCongelado();
	}

}
