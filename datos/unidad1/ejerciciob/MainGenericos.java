public class MainGenericos {

    public static void main(String[] args) {

        Producto<?>[] inventario = new Producto<?>[4];

        inventario[0] = new Libro("Pantalla", 119, 300);
        inventario[1] = new Libro("Celular", 229, 400);
        inventario[2] = new Libro("Laptop", 2000, 500);
        inventario[3] = new Libro("Table", 1000, 600);

        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }
    }
}