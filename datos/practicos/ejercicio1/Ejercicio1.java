package datos.practicos.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int X = 7;

        /* FASE 1: UNIDIMENSIONAL */

        /* Tarea 1.1 */
        int[] temperaturas = {12, -3, 4, 8, -1, 7, 15, 2};

        // Calcular y mostrar el promedio
        System.out.println("FASE 1: UNIDIMENSIONAL");
        System.out.println("Promedio de temperaturas positivas: "
                + promedioPositivas(temperaturas));

        // Mostrar los indices con temperaturas bajo cero
        System.out.println("Indices con temperaturas bajo cero:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 0) {
                System.out.println(i);
            }
        }

        /*
         * Tarea 1.2
         * ¿Por que en Java un arreglo unidimensional no puede cambiar de tamano en tiempo de ejecucion?
         * En Java, un arreglo no puede cambiar de tamano porque su longitud se establece cuando se crea y permanece fija.
  
         * ¿Que ocurre internamente en memoria cuando intentas acceder al indice temperaturas[8]?
         * Cuando intentamos acceder a temperaturas[8], se produce una ArrayIndexOutOfBoundsException, porque los indices validos van del 0 al 7. Java detecta que se intenta 
         * acceder a una posicion fuera de los limites del arreglo.
         */


        /*FASE 2: BIDIMENSIONAL*/

        /* Tarea 2.1 */
        int[][] inventario = {
            {10, 20, 15, 5},
            {8, X + 5, 12, 30},
            {25, 14, 0, 18},
            {2, 9, 11, 40}
        };

        // Total de stock por sucursal
        System.out.println("\nFASE 2: BIDIMENSIONAL");
        System.out.println("Total de stock por sucursal:");

        for (int fila = 0; fila < inventario.length; fila++) {
            int total = 0;

            for (int columna = 0;
                 columna < inventario[fila].length; columna++) {
                total += inventario[fila][columna];
            }

            System.out.println("Sucursal " + (fila + 1) + ": " + total);
        }

        // Diagonal principal
        System.out.println("\nDiagonal principal:");

        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i][i]);
        }

        /*
         * Tarea 2.2
         *
         * Explica la diferencia en almacenamiento de memoria de Java entre un arreglo bidimensional regular y un arreglo dentado (jagged array).
         * Un arreglo bidimensional regular tiene todas sus filas con la misma cantidad de columnas.
         
         * En cambio, un arreglo dentado (jagged array) permite que cada fila tenga una cantidad diferente de elementos.
         * Esto se debe a que cada fila es un arreglo independiente.
         */


        /*FASE 3: TRIDIMENSIONAL*/

        /* Tarea 3.1 */
        int[][][] ocupacion = new int[2][3][3];

        // Llenar el arreglo con los valores correspondientes
        System.out.println("\nFASE 3: TRIDIMENSIONAL");

        for (int e = 0; e < ocupacion.length; e++) {
            for (int p = 0; p < ocupacion[e].length; p++) {
                for (int a = 0; a < ocupacion[e][p].length; a++) {
                    ocupacion[e][p][a] = e + p + a + X;
                }
            }
        }

        // Tarea 3.2: Mostrar las coordenadas con valores pares
        System.out.println("Coordenadas con valores pares:");

        for (int e = 0; e < ocupacion.length; e++) {
            for (int p = 0; p < ocupacion[e].length; p++) {
                for (int a = 0; a < ocupacion[e][p].length; a++) {
                    if (ocupacion[e][p][a] % 2 == 0) {
                        System.out.println("[" + e + "][" + p + "]["
                                + a + "] = " + ocupacion[e][p][a]);
                    }
                }
            }
        }

        /*
         * Tarea 3.3
         *
         * Si el sistema creciera a 100 edificios, 50 pisos y 50 pasillos
         * Tendria 250000 posiciones.
         *
         * Al aumentar los datos, se necesitara mas memoria y tiempo para recorrer el arreglo. 
           Ademas, utilizar varios ciclos for anidados puede dificultar la lectura y el mantenimiento del codigo.
         *
         * Con la programacion orientada a objetos se pueden crear clases como Edificio, Piso y Pasillo para organizar mejor la informacion. 
         * Las listas de objetos permiten agregar o eliminar elementos con mayor facilidad.
         *
         * Sin embargo, los objetos tambien utilizan memoria, por lo que no siempre ofrecen un mejor rendimiento.
         */
    }

    // Metodo para calcular el promedio de temperaturas positivas
    public static double promedioPositivas(int[] temperaturas) {
        int suma = 0;
        int cantidad = 0;

        for (int temperatura : temperaturas) {
            if (temperatura > 0) {
                suma += temperatura;
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }
}