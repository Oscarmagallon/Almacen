package paquete;

public final class Azucaradas extends Bebida {
	private double azucar;
	private boolean promocion;

	public Azucaradas(String id, double litros, double precio, String marca, double azucar, boolean promocion) {
		super(id, litros, precio, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}

	@Override
	public double getPrecio() {
		if (promocion == true){
			return super.getPrecio()*0.9;
		} else {
			return super.getPrecio();
		}
		
		
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	

}
