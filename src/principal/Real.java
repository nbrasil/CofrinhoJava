package main;

public class Real extends Moeda{
	

	public Real(double valor) {
		super(valor);
	}

	public void info() {
		super.info();
	}

	public double conversao() {
		return valor * 1;
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

	@Override
	public String toString() {
		return "Real [valor=" + valor + "]";
	}


}
