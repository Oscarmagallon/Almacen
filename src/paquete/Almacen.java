package paquete;


public class Almacen {
protected String nombre;
protected Bebida mEstanteria[][];
public Almacen(String nombre) {
	super();
	this.nombre = nombre;
	mEstanteria = new Bebida [5][5];
    Azucaradas a = new Azucaradas("2", 2, 4, "Fanta", 15, true);
    Azucaradas c = new Azucaradas("3", 5, 9, "Fanta naranja", 17, false);
	
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
			if(bebida != null && bebida.getMarca().equals("pepsi")) {
				precioTotal+=bebida.getPrecio();
			}
		}
	}
	return precioTotal;
}
public double calcularEstanteria() {
	double precioTotal =0;
	for (Bebida[] bebidas : mEstanteria) {
		for (Bebida bebida : bebidas) {
			if(bebida!=null) {
				precioTotal+= bebida.getPrecio();
			}
		}
	}
	return precioTotal;
}
public void anadirProducto() {
Azucaradas a = new Azucaradas("5", 4, 10, "Pepsi", 15, false);
String codigo = a.getId();
boolean uno = false;
boolean dos = false;
for (Bebida[] bebidas : mEstanteria) {
	for (Bebida bebida : bebidas) {
		if(bebida!=null && bebida.getId().equals(codigo)){
			uno=true;
			System.out.println("Lo tenemos");
			return;
		} 
			
		
	}
}
if(uno==false) {
	 for (int i = 0; i < mEstanteria.length; i++) {
         for (int j = 0; j < mEstanteria.length; j++) {
             if (mEstanteria[i][j]==null) {
                 mEstanteria[i][j]=a;
                 System.out.println("Producto a�adido");
                 dos=true;
                 break;
             }

}
	 }}}

}


