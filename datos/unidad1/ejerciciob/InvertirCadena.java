public class InvertirCadena {

    public static String invertir(String s) {
        // Caso base
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Caso recursivo
        return invertir(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(invertir("recursion"));
        System.out.println(invertir("Hola"));
        System.out.println(invertir("Mundo"));
        System.out.println(invertir("Mundo"));
    }
}