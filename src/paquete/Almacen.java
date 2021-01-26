package paquete;

public class Almacen {
protected String nombre;
protected Bebida mEstanteria[][];
public Almacen(String nombre) {
	super();
	this.nombre = nombre;
	mEstanteria = new Bebida [5][5];
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Bebida[][] getmEstanteria() {
	return mEstanteria;
}
public void setmEstanteria(Bebida[][] mEstanteria) {
	this.mEstanteria = mEstanteria;
}

public double calcularPrecioTotal() {
	double precioTotal=0;
	
	for (Bebida[] bebidas : mEstanteria) {
		for (Bebida bebida : bebidas) {
			if(bebida != null && bebida.getMarca().equals("Marca deseada")) {
				precioTotal+=bebida.getPrecio();
			}
		}
	}
	return precioTotal;
}


}
