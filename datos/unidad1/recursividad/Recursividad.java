package datos.unidad1.recursividad;

public class Recursividad {

    public static void saludo(int total, String nombre) {

        if (total <= 0) {
            return;
        } else {
            System.out.println("Hola " + nombre);
            saludo(total - 1, nombre);
        }
    }

 
      /**
    *Funcion que realiza la suma de los numeros de un arreglo usando recursividad.
    *Fecha: 25 Septiembre
    *Autor: Luis Hernández
    **/
    public static int sumaRecursiva(int[] datos, int n) {
    if (n <= 0) {
        return 0;
    } else {
        return datos[n - 1] + sumaRecursiva(datos, n - 1);
    }
    }

     /**
    *Funcion que realiza cuenta regresiva de acuerdo a un valor entero.
    *Fecha: 25 Septiembre
    *Autor: Luis Hernández
    **/
    public static void cuentaRegresiva(int n) {
           if(n < 1){
                   return;
           } else {
                   System.out.println(n);
                   cuentaRegresiva(n-1);
           }
    }

    public static void main(String[] a) {
        saludo(10, "Fernando");
        cuentaRegresiva(100);
        int[] datos = {3,4,5,6,7,8};
        int resultado = sumaRecursiva(datos, datos.length);
        System.out.println("La suma es: " + resultado);
    }
}
