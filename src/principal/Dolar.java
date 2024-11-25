package main;

public class Dolar extends Moeda{
	

	public Dolar(double valor) {
		super(valor);
	}

	public double conversao() {
		return valor*0.17;
		}
	
	public void info() {
		super.info();
	}

	@Override
	public String toString() {
		return "Dolar [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	}
	


