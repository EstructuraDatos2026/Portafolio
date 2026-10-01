

public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    public void mostrarDetalles() {
        String datos = "Nombre: " + super.nombre
                + "\nPrecio: " + super.precio
                + "\nPaginas: " + super.getExtra();

        System.out.println(datos);
    }
}