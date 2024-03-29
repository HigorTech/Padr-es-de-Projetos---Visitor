
public class Salgados {

	private String tipo;
	private double valorPronta;
	private double valorCongelado;
	private double valorEntrega;
	
	
	public Salgados(String tipo, double valorPronta, double valorCongelado, double valorEntrega) {
		super();
		this.tipo = tipo;
		this.valorPronta = valorPronta;
		this.valorCongelado = valorCongelado;
		this.valorEntrega = valorEntrega;
	}

	
	public Object accept(Visitor visitor) {
		return visitor.visitor(this);
	}

	public double getValorPronta() {
		return valorPronta;
	}


	public double getValorCongelado() {
		return valorCongelado;
	}


	public double getValorEntrega() {
		return valorEntrega;
	}
	
	
	
}
