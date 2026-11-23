
import java.util.Scanner;
import java.util.Arrays;


public class arrays {
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Bateria ejercicios de arrays en java");
        continuar();
        AuxiliaresArrays.teclado.close();
    }

    /* EJERCICIOS ARRAYS */
    public static void ej1() {
        System.out.println("--- Ejercicio 1 ---");
        double[] notas = AuxiliaresArrays.auxCrearArrayRealesUsuario(10);
        System.out.println("Los valores introducidos son:");
        AuxiliaresArrays.auxMostrarArrayReales(notas);
    }

    public static void ej2() {
        System.out.println("--- Ejercicio 2 ---");
        double[] numeros = AuxiliaresArrays.auxCrearArrayRealesUsuario(10);
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) suma += numeros[i];
        System.out.println("La suma de todos los valores es: " + suma);
    }

    public static void ej3() {
        System.out.println("--- Ejercicio 3 ---");
        double[] numeros = AuxiliaresArrays.auxCrearArrayRealesUsuario(10);
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) max = numeros[i];
            if (numeros[i] < min) min = numeros[i];
        }
        System.out.println("El valor máximo es: " + max + "\nEl valor mínimo es: " + min);
    }

    public static void ej4() {
        System.out.println("--- Ejercicio 4 ---");
        int[] numeros = AuxiliaresArrays.auxCrearArrayEnterosUsuario(20);
        int sumaPositivos = 0, sumaNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) sumaPositivos += numeros[i];
            else if (numeros[i] < 0) sumaNegativos += numeros[i];
        }
        System.out.println("Suma de positivos: " + sumaPositivos + "\nSuma de negativos: " + sumaNegativos);
    }

    public static void ej5() {
        System.out.println("--- Ejercicio 5 ---");
        double[] numeros = AuxiliaresArrays.auxCrearArrayRealesUsuario(20);
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) suma += numeros[i];
        System.out.println("La media de los valores es: " + (suma / numeros.length));
    }

    public static void ej6() {
        System.out.println("--- Ejercicio 6 ---");
        System.out.println("Dime el tamaño del array (N):");
        int n = AuxiliaresArrays.auxLeerEntero();
        System.out.println("Dime el valor para rellenar (M):");
        int m = AuxiliaresArrays.auxLeerEntero();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = m;
        AuxiliaresArrays.auxMostrarArrayEnteros(array);
    }

    public static void ej7() {
        System.out.println("--- Ejercicio 7 ---");
        System.out.println("Dime el valor inicial (P):");
        int p = AuxiliaresArrays.auxLeerEntero();
        System.out.println("Dime el valor final (Q):");
        int q = AuxiliaresArrays.auxLeerEntero();
        int inicio = Math.min(p, q), fin = Math.max(p, q);
        int[] array = new int[fin - inicio + 1];
        for (int i = 0; i < array.length; i++) array[i] = inicio + i;
        AuxiliaresArrays.auxMostrarArrayEnteros(array);
    }

    public static void ej8() {
        System.out.println("--- Ejercicio 8 ---");
        double[] aleatorios = new double[100];
        for (int i = 0; i < aleatorios.length; i++) aleatorios[i] = Math.random();
        System.out.println("Dime un valor real R (entre 0.0 y 1.0):");
        double r = AuxiliaresArrays.auxLeerDoble();
        int contador = 0;
        for (int i = 0; i < aleatorios.length; i++) if (aleatorios[i] >= r) contador++;
        System.out.println("Hay " + contador + " valores iguales o superiores a " + r);
    }

    public static void ej9() {
        System.out.println("--- Ejercicio 9 ---");
        int[] aleatorios = new int[100];
        for (int i = 0; i < aleatorios.length; i++) aleatorios[i] = 1 + (int)(Math.random() * 10);
        System.out.println("Dime un valor N para buscar (1-10):");
        int n = AuxiliaresArrays.auxLeerEntero();
        System.out.print("El valor " + n + " aparece en las posiciones: ");
        for (int i = 0; i < aleatorios.length; i++) if (aleatorios[i] == n) System.out.print(i + " ");
        System.out.println();
    }

    public static void ej10() {
        System.out.println("--- Ejercicio 10 ---");
        System.out.println("¿Cuántas alturas vas a introducir (N)?");
        int n = AuxiliaresArrays.auxLeerEntero();
        double[] alturas = AuxiliaresArrays.auxCrearArrayRealesUsuario(n);
        double suma = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
            if (alturas[i] > max) max = alturas[i];
            if (alturas[i] < min) min = alturas[i];
        }
        double media = suma / alturas.length;
        int porEncima = 0, porDebajo = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) porEncima++;
            if (alturas[i] < media) porDebajo++;
        }
        System.out.println("Media: " + media + " | Máxima: " + max + " | Mínima: " + min);
        System.out.println("Por encima de la media: " + porEncima + " | Por debajo: " + porDebajo);
    }

    public static void ej11() {
        System.out.println("--- Ejercicio 11 ---");
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for (int i = 0; i < array1.length; i++) array1[i] = i + 1;
        for (int i = 0; i < array1.length; i++) array2[i] = array1[array1.length - 1 - i];
        System.out.println("Array 1:"); AuxiliaresArrays.auxMostrarArrayEnteros(array1);
        System.out.println("Array 2 (inverso):"); AuxiliaresArrays.auxMostrarArrayEnteros(array2);
    }

    public static void ej12() {
        System.out.println("--- Ejercicio 12 ---");
        int[] array = new int[10];
        String opcion = "";
        while (!opcion.equals("c")) {
            System.out.println("\nMenú:\na. Mostrar valores.\nb. Introducir valor.\nc. Salir.");
            opcion = AuxiliaresArrays.auxLeerString();
            switch (opcion) {
                case "a": AuxiliaresArrays.auxMostrarArrayEnteros(array); break;
                case "b":
                    System.out.println("Dime un valor (V):"); int v = AuxiliaresArrays.auxLeerEntero();
                    System.out.println("Dime una posición (P) [0-9]:"); int p = AuxiliaresArrays.auxLeerEnteroRango(0, 9);
                    array[p] = v; break;
                case "c": System.out.println("Saliendo del menú..."); break;
                default: System.out.println("Opción incorrecta.");
            }
        }
    }

    public static void ej13() {
        System.out.println("--- Ejercicio 13 ---");
        System.out.println("Dime el valor inicial (V):"); int v = AuxiliaresArrays.auxLeerEntero();
        System.out.println("Dime el incremento (I):"); int inc = AuxiliaresArrays.auxLeerEntero();
        System.out.println("Dime el número de valores a crear (N):"); int n = AuxiliaresArrays.auxLeerEntero();
        int[] secuencia = new int[n];
        for (int i = 0; i < secuencia.length; i++) secuencia[i] = v + (i * inc);
        AuxiliaresArrays.auxMostrarArrayEnteros(secuencia);
    }

    public static void ej14() {
        System.out.println("--- Ejercicio 14 ---");
        int[] secuencia = new int[55];
        int indice = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[indice] = i;
                indice++;
            }
        }
        AuxiliaresArrays.auxMostrarArrayEnteros(secuencia);
    }

    public static void ej15() {
        System.out.println("--- Ejercicio 15 ---");
        System.out.println("Dime el tamaño del array (N):"); int n = AuxiliaresArrays.auxLeerEntero();
        System.out.println("Dime el valor para rellenar (M):"); int m = AuxiliaresArrays.auxLeerEntero();
        int[] array = new int[n];
        Arrays.fill(array, m);
        AuxiliaresArrays.auxMostrarArrayEnteros(array);
    }

    public static void ej16() {
        System.out.println("--- Ejercicio 16 ---");
        int[] secuencia = new int[55];
        int inicio = 0;
        for (int i = 1; i <= 10; i++) {
            Arrays.fill(secuencia, inicio, inicio + i, i);
            inicio += i;
        }
        AuxiliaresArrays.auxMostrarArrayEnteros(secuencia);
    }

    public static void ej17() {
        System.out.println("--- Ejercicio 17 ---");
        System.out.println("Introduce los primeros 10 valores:");
        int[] array1 = AuxiliaresArrays.auxCrearArrayEnterosUsuario(10);
        System.out.println("Introduce los siguientes 10 valores:");
        int[] array2 = AuxiliaresArrays.auxCrearArrayEnterosUsuario(10);
        
        if (Arrays.equals(array1, array2)) System.out.println("Los dos arrays SON iguales.");
        else System.out.println("Los dos arrays NO son iguales.");
    }

    public static void ej18() {
        System.out.println("--- Ejercicio 18 ---");
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) array[i] = (int)(Math.random() * 10);
        Arrays.sort(array);
        System.out.println("Array ordenado:");
        AuxiliaresArrays.auxMostrarArrayEnteros(array);
    }

    public static void ej19() {
        System.out.println("--- Ejercicio 19 ---");
        System.out.println("Introduce las puntuaciones de los 8 jugadores (ej. 1000 - 2800):");
        int[] puntuaciones = AuxiliaresArrays.auxCrearArrayEnterosUsuario(8);
        Arrays.sort(puntuaciones);
        System.out.println("Ranking (Orden Descendente):");
        for (int i = puntuaciones.length - 1; i >= 0; i--) System.out.println("Puntuación: " + puntuaciones[i]);
    }

    public static void ej20() {
        System.out.println("--- Ejercicio 20 ---");
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) array[i] = (int)(Math.random() * 100);
        System.out.println("Dime un número a buscar en el array (entre 0 y 99):");
        int n = AuxiliaresArrays.auxLeerEntero();
        int contador = 0;
        for (int i = 0; i < array.length; i++) if (array[i] == n) contador++;
        
        if (contador > 0) System.out.println("El número " + n + " existe y aparece " + contador + " veces.");
        else System.out.println("El número " + n + " no existe en el array.");
    }

    /* MÉTODOS DE MENÚ  */
    public static int continuar() {
        System.out.println("Si quieres continuar introduce 1");
        System.out.println("Pero si no quieres continuar con la bateria introduce 0");
        int selec = AuxiliaresArrays.auxLeerEntero();
        while (selec != 0 && selec != 1) {
            System.out.println("NUMERO INTRODUCIDO NO VÁLIDO INTRODUCE 1 PARA CONTINUAR O 0 PARA SALIR ");
            selec = AuxiliaresArrays.auxLeerEntero();
        }
        if (selec == 1) {
            mostarMenu();
            opciones();
        } else {
            System.out.println("Fin de la batería de ejercicios");
        }
        return selec;
    }

    public static String mostarMenu() {
        System.out.println("Quiere mostrar el menu de opciones de ejercicios");
        System.out.println("Pon 'si' para mostrarlo, pon no para que 'no' se muestre");
        String mostrar = AuxiliaresArrays.auxLeerString();
        while (!mostrar.equals("si") && !mostrar.equals("no")) {
            System.err.println("LO QUE HAS INTRODUCIDO NO ES VALIDO VUELVE A INTRODUCIR 'si' o 'no'");
            mostrar = AuxiliaresArrays.auxLeerString();
        }
        if (mostrar.equals("si")) {
            System.out.println("\t 1 al 14 -- Ejercicios básicos de la práctica[cite: 3, 4]");
            System.out.println("\t 15 al 20 -- Ejercicios usando la clase java.util.Arrays[cite: 5]");
        }
        System.out.println("MOSTRANDO PANEL DE EJERCICIOS");
        return mostrar;
    }

    public static int opciones() {
        System.out.println("Selecciona cual quieres ejecutar (1-20) o 0 para salir");
        int ejercicioSeleccionado = AuxiliaresArrays.auxLeerEntero();
        switch (ejercicioSeleccionado) {
            case 1: ej1(); break;
            case 2: ej2(); break;
            case 3: ej3(); break;
            case 4: ej4(); break;
            case 5: ej5(); break;
            case 6: ej6(); break;
            case 7: ej7(); break;
            case 8: ej8(); break;
            case 9: ej9(); break;
            case 10: ej10(); break;
            case 11: ej11(); break;
            case 12: ej12(); break;
            case 13: ej13(); break;
            case 14: ej14(); break;
            case 15: ej15(); break;
            case 16: ej16(); break;
            case 17: ej17(); break;
            case 18: ej18(); break;
            case 19: ej19(); break;
            case 20: ej20(); break;
            case 0:
                System.out.println("Fin de la batería de ejercicios");
                break;
            default:
                System.out.println("Todavia no he implementado ese ejercicio");
        }
        return ejercicioSeleccionado;
    }
}