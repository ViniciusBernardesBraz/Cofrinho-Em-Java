package Uninter;

public class Euro extends Moeda {
	double valor;
	
	public Euro(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	public double conveter() {
		double total = 5.17 * valor;
		return total;
	}

	@Override
	public String toString() {
		return "Euro valor - " + valor + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}	
}
