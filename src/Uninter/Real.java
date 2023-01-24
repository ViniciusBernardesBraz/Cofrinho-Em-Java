package Uninter;

public class Real extends Moeda{
	double valor;

	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}
	
	public double conveter() {
		double total = valor;
		return total;
	}
	
	@Override
	public String toString() {
		return "Real valor - " + valor + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}
