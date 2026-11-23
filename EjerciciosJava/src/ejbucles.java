import java.util.Scanner;

public class ejbucles {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bateria ejercicios de bucles en java");
        continuar();
        teclado.close();
    }

    /* EJERCICIOS */

    public static void ej1() {
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }
    }

    public static void ej2() {
        for (int i = 0; i < 201; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void ej3() {
        for (int i = 1; i < 201; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ej4() {
        System.out.println("Introduce un numero");
        int n = auxLeerEntero();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void ej5() {
        System.out.println("introduce un numero positivo para hacer su factorial");
        int n = auxLeerEntero();
        int factorial = 1;
        while (n > 0) {
            System.out.println(n);
            n--;
            factorial = factorial * n;
        }
        System.out.println("EL FACTORIAL DEL NUMERO ES " + factorial);
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void ej6() {
        System.out.println("introduce un numero no nulo");
        int n = auxLeerEntero();
        int i = 10;
        boolean haynegativo = false;
        while (i > 0) {
            if (n == 0) {
                System.out.println("EL NÚMERO ES NULO, INTRODUCELO OTRA VEZ");
                n = auxLeerEntero();
            } else {
                i--;
                if (n > 0) {
                    haynegativo = true;
                }
                System.out.println("te quedan " + i + " números");
                System.out.println("introduce un numero no nulo");
                n = auxLeerEntero();
            }
        }
        if (haynegativo) {
            System.out.println("HAY ALGUN NUMERO NEGATIVO");
        } else {
            System.out.println("HO HAY NINGUN NUMERO NEGATIVO");
        }
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void ej7() {
        System.out.println("introduce un numero no nulo");
        int n = auxLeerEntero();
        int x = 10;
        int i = 0;
        int y = 0;
        while (x > 0) {
            if (n == 0) {
                System.out.println("EL NÚMERO ES NULO, INTRODUCELO OTRA VEZ");
                n = auxLeerEntero();
            } else {
                x--;
                if (n > 0) {
                    i++;
                } else {
                    y++;
                }
                System.out.println("te quedan " + x + " números");
                System.out.println("introduce un numero no nulo");
                n = auxLeerEntero();
            }
        }
        System.out.println("Has introducido " + i + " numeros positivos");
        System.out.println("Has introducido " + y + " numeros negativos");
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void ej8() {
        System.out.println("Introduce un numero para continuar o 0 para salir");
        int n = auxLeerEntero();
        int i = 0;
        int y = 0;
        while (n != 0) {
            if (n > 0) {
                i++;
            } else {
                y++;
            }
            System.out.println("Introduce un numero para continuar o 0 para salir");
            n = auxLeerEntero();
        }
        System.out.println("Has introducido " + i + " numeros positivos");
        System.out.println("Has introducido " + y + " numeros negativos");
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void ej9() {
        int i = 1;
        int suma = 1;
        int multi = 1;
        while (i < 10) {
            i++;
            suma = suma + i;
            multi = multi * i;
        }
        System.out.println("EL RESULTADO DE LA SUMA ES " + suma);
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES " + multi);
    }

    public static void ej10() {
        System.out.println("INTRODUCE UNA SECUNCIA DE NOTAS, PARA TERMINAR LA SECUENCIA PON -1");
        int nota = auxLeerEntero();
        Boolean nota10 = false;
        int alumnos = 0;
        while (nota != -1 && nota >= 0 && nota <= 10) {
            if (nota == 10) {
                nota10 = true;
                alumnos++;
            }
            System.out.println("INTRODUCE UNA SECUNCIA DE NOTAS, PARA TERMINAR LA SECUENCIA PON -1");
            nota = auxLeerEntero();
        }
        if (nota10) {
            System.out.println("HA SANCADO UN 10 " + alumnos + " alumnos");
        } else if (nota == -1) {
            System.out.println("HAS FINALIZADO EL PROGRAMA");
        } else {
            System.out.println("nadie ha salcado un 10");
        }
    }

    public static void ej11() {
        int p = 100;
        int i = 101;
        int sumap = 0;
        int sumai = 0;
        while (p <= 200) {
            sumap += p;
            p += 2;
            if (i < 200) {
                sumai += i;
                i += 2;
            }
        }
        System.out.println("LA SUMA DE LOS NUMEROS PARES ES " + sumap);
        System.out.println("LA SUMA DE LOS NUMEROS IMPARES ES " + sumai);
    }

    public static void ej12() {
        System.out.println("ELEVADOR DE NUMEROS");
        System.out.println("INTRODUCE UN NUMERO PARA ELEVARLO");
        int a = auxLeerEntero();
        System.out.println("INTRODUCE EL NUMERO AL QUE LO QUIERES ELEVAR");
        int b = auxLeerEntero();
        int i = 0;
        int potencia = 1;
        if (b == 0) {
            a = 1;
            System.out.println("LA SOLUCIÓN ES 1");
        } else {
            while (i < b) {
                potencia *= a;
                b--;
            }
            System.out.println("LA SOLUCION ES " + potencia);
        }
    }

    public static void ej13() {
        System.out.println("Piensa un numero y el ordenador te hara preguntas sobre ese numero");
        int min = 1;
        int max = 100;

        while (min <= max) {
            int medio = (min + max) / 2;
            System.out.println("TU NUMERO ES " + medio);
            System.out.println("DIME SI ES CORRECTO (OPCIÓN 1), MAYOR (OPCIÓN 2) O MENOR (OPCIÓN 3)");
            int opcion = auxLeerEnteroRango(1, 3);

            switch (opcion) {
                case 1:
                    System.out.println("He acertado");
                    return;
                case 2:
                    min = medio + 1;
                    break;
                case 3:
                    max = medio - 1;
                    break;
            }
        }

        System.out.println("Tus respuestas no son coherentes con un numero del 1 al 100");
    }

    public static void ej14() { //se puede refactorizar
        System.out.println("introduce una cantidad multiplo de 5");
        int eur=auxLeerEntero();
        int saldo =eur;
        int quinientos=0;
        int doscientos=0;
        int cien=0;
        int cincuenta=0;
        int veinte=0;
        int diez=0;
        int cinco=0;
        while (eur>0) {
            if (saldo>=500) {
                saldo-=500;
                quinientos++;
            }
            else if (saldo>=200) {
                saldo-=200;
                doscientos++;
            }
            else if (saldo>=100) {
                saldo-=100;
                cien++;
            }else if (saldo>=50) {
                saldo-=50;
                cincuenta++;
            }else if (saldo>=20) {
                saldo-=20;
                veinte++;
            }else if (saldo>=10) {
                saldo-=10;
                diez++;
            }else if (saldo>5) {
                saldo-=5;
                cinco++;
            }
        }
        System.out.println("PARA LA CANTIDAD " + eur +"SE HAN DADO LOS SIGUIENTES BILLETES");
        System.out.println(quinientos+" DE 500");
        System.out.println(doscientos+" DE 200");
        System.out.println(cien+" DE 100");
        System.out.println(cincuenta+" DE 50");
        System.out.println(veinte+" DE 20");
        System.out.println(diez+" DE 10");
        System.out.println(cinco+" DE 5");
    }
    /* METODOS AUXILIARES */

    public static int continuar() {
        System.out.println("Si quieres continuar introduce 1");
        System.out.println("Pero si no quieres continuar con la bateria introduce 0");
        int selec = auxLeerEntero();
        while (selec != 0 && selec != 1) {
            System.out.println("NUMERO INTRODUCIDO NO VÁLIDO INTRODUCE 1 PARA CONTINUAR O 0 PARA SALIR ");
            selec = auxLeerEntero();
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
        String mostrar = auxLeerString();
        while (!mostrar.equals("si") && !mostrar.equals("no")) {
            System.err.println("LO QUE HAS INTRODUCIDO NO ES VALIDO VUELVE A INTRODUCIR 'si' o 'no'");
            mostrar = auxLeerString();
        }
        if (mostrar.equals("si")) {
            System.out.println("\t 1 -- Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20). ");
            System.out.println("\t 2 -- Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2. ");
            System.out.println("\t 3 -- Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1. ");
            System.out.println("\t 4 -- Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado. ");
            System.out.println("\t 5 -- Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!\r\n" + //
                                    "\t\t Siendo el factorial:\r\n" + //
                                    "\t\t 0! = 1\r\n" + //
                                    "\t\t 1! = 1\r\n" + //
                                    "\t\t 2! = 2 * 1\r\n" + //
                                    "\t\t 3! = 3 * 2* 1\r\n" + //
                                    "\t\t N! = N * (N-1) * (N-2)........* 3*2*1 ");
            System.out.println("\t 6 -- Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leídoalgún número negativo o no.");
            System.out.println( "\t 7 -- Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos. ");
            System.out.println(  "\t 8 -- Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos. ");
            System.out.println( "\t 9 -- Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números naturales. ");
            System.out.println(  "\t 10 -- Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.");
            System.out.println(  "\t 11 -- Realiza un programa que sume independientemente los pares y los impares de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas. ");
            System.out.println( "\t 12 -- Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por pantalla. ");
            System.out.println( "\t 13 -- Realiza un programa donde el usuario \"piensa\" un número del 1 al 100 y el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado). ");
            System.out.println( "\t 14 -- Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible).");
        }
        System.out.println("MOSTRANDO PANEL DE EJERCICIOS");
        return mostrar;
    }

    public static int opciones() {
        System.out.println("Selecciona cual quieres ejecutar (1-14) o 0 para salir");
        int ejercicioSeleccionado = auxLeerEntero();
        switch (ejercicioSeleccionado) {
            case 1:
                ej1();
                break;
            case 2:
                ej2();
                break;
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:
                ej6();
                break;
            case 7:
                ej7();
                break;
            case 8:
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
                break;
            case 14:
                ej14();
                break;
            case 88:
                System.out.println("Fin de la batería de ejercicios");
                break;
            default:
                System.out.println("Todavia no he implementado ese ejercicio");
        }
        return ejercicioSeleccionado;
    }

    public static int auxLeerEntero() {
        while (!teclado.hasNextInt()) {
            System.out.println("ERROR, INTRODUCE UN NUMERO ENTERO");
            teclado.nextLine();
        }
        int aux = teclado.nexString();teclado.nextLine();
        return aux; 
    }
    public static int auxLeerEnteroDivisor(int divisor) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) {
                aux = teclado.nextInt();teclado.nextLine();
                if (aux % divisor==0) {
                    correcto=true;
                } 
                else {
                System.out.println("EL NUMERO INTRODUCIDO NO ES MULTIPLO DE "+ divisor);
                }
            } 
            else{
                System.out.println("VUELVE A INTRODUCIR EL NUMERO");
            }
        }
        return aux;
    }

    public static int auxLeerEnteroRango(int minimo, int maximo) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) {
                aux = teclado.nextInt();teclado.nextLine();
                if (aux> maximo || aux<minimo) {
                    System.out.println("EL NUMERO NO ESTA DENTRO DEL RANGO " + minimo + "." + maximo);
                } 
                else {
                correcto = true;
                }
            } 
            else{
                System.out.println("VUELVE A INTRODUCIR EL NUMERO");
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
        String aux = teclado.nextLine().toLowerCase();
        return aux;
    }
}
