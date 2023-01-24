package Uninter;

public class Dolar extends Moeda{
	double valor;
	
	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	public double conveter() {
		double total = 5.14 * valor;
		return total;
	}

	@Override
	public String toString() {
		return "Dolar valor - " + valor + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
}
