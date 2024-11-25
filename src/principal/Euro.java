package main;

public class Euro extends Moeda{


	public Euro(double valor) {
		super(valor);
	}

	public double conversao() {
		return valor*0.16;
		}
	
	public void info() {
		super.info();
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
		return "Euro [valor=" + valor + "]";
	}
	

}
