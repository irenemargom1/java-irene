import java.util.Scanner;

public class AuxiliaresArrays {
    public static Scanner teclado = new Scanner(System.in);

    public static int[] auxCrearArrayEnterosUsuario(int tamaño) {
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce el número entero (" + (i + 1) + "/" + tamaño + "):");
            array[i] = auxLeerEntero();
        }
        return array;
    }

    public static double[] auxCrearArrayRealesUsuario(int tamaño) {
        double[] array = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce el número real (" + (i + 1) + "/" + tamaño + "):");
            array[i] = auxLeerDoble();
        }
        return array;
    }

    public static void auxMostrarArrayEnteros(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    public static void auxMostrarArrayReales(double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    public static int auxLeerEntero() {
        while (!teclado.hasNextInt()) {
            System.out.println("ERROR, INTRODUCE UN NUMERO ENTERO");
            teclado.nextLine();
        }
        int aux = teclado.nextInt();
        teclado.nextLine();
        return aux; 
    }

    public static int auxLeerEnteroDivisor(int divisor) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) {
                aux = teclado.nextInt();
                teclado.nextLine();
                if (aux % divisor == 0) {
                    correcto = true;
                } else {
                    System.out.println("EL NUMERO INTRODUCIDO NO ES MULTIPLO DE " + divisor);
                }
            } else {
                System.out.println("VUELVE A INTRODUCIR EL NUMERO");
                teclado.nextLine();
            }
        }
        return aux;
    }

    public static int auxLeerEnteroRango(int minimo, int maximo) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) {
                aux = teclado.nextInt();
                teclado.nextLine();
                if (aux > maximo || aux < minimo) {
                    System.out.println("EL NUMERO NO ESTA DENTRO DEL RANGO " + minimo + " - " + maximo);
                } else {
                    correcto = true;
                }
            } else {
                System.out.println("VUELVE A INTRODUCIR EL NUMERO");
                teclado.nextLine();
            }
        }
        return aux;
    }

    public static double auxLeerDoble() {
        while (!teclado.hasNextDouble()) {
            System.out.println("ERROR, INTRODUCE UN NUMERO DECIMAL");
            teclado.nextLine();
        }
        double aux = teclado.nextDouble();
        teclado.nextLine();
        return aux;
    }

    public static String auxLeerString() {
        return teclado.nextLine().toLowerCase();
    }
}
