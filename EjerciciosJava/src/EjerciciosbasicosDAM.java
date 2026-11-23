import java.util.Scanner;
public class EjerciciosbasicosDAM {
    //Leer el teclado
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bateria ejercicios de condicionales en java");
        int ejercicioSeleccionado;
        do{
            System.out.println("Selecciona cual quieres ejecutar (1-18) o 0 para salir");
            ejercicioSeleccionado =auxLeerEntero();
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
                case 15:
                    ej15();
                    break;
                case 16:
                    ej16();
                    break;
                case 17:
                    ej17();
                    break;
                case 18:
                    ej18();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Todavia no he implementado ese ejercicio");
            }
        }
        while (ejercicioSeleccionado != 0);
        teclado.close();
    }
    public static void ej1() {
        System.out.println("Hola!! Bienvenido ¿cómo te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("Hola" + nombre);
    }
    public static void ej2() {
        double a = 2.5;
        double b = 2.5;
        double area = a * b;
        System.out.println("El área del cuadrado es " + area);
    }
    public static void ej3() {
        System.out.println("Introduce el lado de un cuadrado para crear su área");
        int lado = auxLeerEntero();
        int area = lado * lado;
        System.out.println("El area del cuadrado el cual has introducido el dado es " + area);
    }
    public static void ej4() {
        System.out.println("Introduce un primer número");
        int num1 = auxLeerEntero();
        System.out.println("Introduce un segundo número");
        int num2 = auxLeerEntero();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int div = num1 / num2;
        int mult = num1 * num2;
        System.out.println("La suma de los numeros es " + suma + ", la resta de los números es " + resta + ", la división de los números es " + div + " y la multiplicación de los números es " + mult);
    }
    public static void ej5() {
        System.out.println("Introduce la dimensión del radio");
        double r = auxLeerDoble();
        double pi = 3.1416;
        double longitud = 2 * pi * r;
        double area = pi * r * r;
        double volumen = (3 / 4) * pi * r * r * r;
        System.out.println("LA longitud, el área y el volumen del radio dado es " + longitud + area + volumen);
    }
    public static void ej6() {
        System.out.println("Escribe el precio de un articulo");
        double precio1 = auxLeerDoble();
        System.out.println("Escribe el precio real de un articulo");
        double precio2 = auxLeerDoble();
        double resultado = ((precio2 - precio1) / precio2) * 100;
        System.out.println("El descuento es " + resultado + "%");
    }
    public static void ej7() {
        System.out.println("Escribe una distancia en millas marinas");
        double millas = auxLeerDoble();
        double metros = millas / 1852;
        System.out.println("El resultado de millas marinas en metros es " + metros);
    }
    public static void ej8() {
        System.out.println("Escriba su edad");
        int edad = auxLeerEntero();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, tienes " + edad + " años");
        }
    }
    public static void ej9() {
        System.out.println("Escriba su edad");
        int edad = auxLeerEntero();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, tienes " + edad + " años");
        } else {
            System.out.println("Eres menor de edad, tienes " + edad + " años");
        }
    }
    public static void ej10() {
        System.out.println("Escriba un número");
        double num1 = auxLeerDoble();
        System.out.println("Escriba un número exceptuando el cero");
        double num2 = auxLeerDoble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double div = num1 / num2;
        double mult = num1 * num2;
        if (num2 == 0) {
            System.out.println("La suma de los numeros es " + suma + ", la resta de los números es " + resta + " y la multiplicación de los números es " + mult);
            System.out.println("La división no es posible hacerla");
        } else {
            System.out.println("La suma de los numeros es " + suma + ", la resta de los números es " + resta + ", la división de los números es " + div + " y la multiplicación de los números es " + mult);
        }
    }
    public static void ej11() {
        System.out.println("Escriba un número");
        double num1 = auxLeerDoble();
        System.out.println("Escriba otro número");
        double num2 = auxLeerDoble();
        if (num1 > num2) {
            System.out.println("El  primer número " + num1 + " es más grande que el segundo número " + num2);
        } else if (num1 < num2) {
            System.out.println("El  primer número " + num1 + " es más pequeño que el segundo número " + num2);
        } else {
            System.out.println("Los dos números son iguales");
        }
    }
    public static void ej12() {
        System.out.println("Escriba un número");
        double num = auxLeerDoble();
        if (num >= 0) {
            System.out.println("El número es positivo " + num);
        } else {
            System.out.println("El número es negativo " + num);
        }
    }
    public static void ej13() {
        System.out.println("Escriba un número");
        double num1 = auxLeerDoble();
        System.out.println("Escriba otro número");
        double num2 = auxLeerDoble();
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else if (num1 < num2) {
            System.out.println("El número mayor es " + num2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
    public static void ej14() {
        System.out.println("Escriba un número");
        double num1 = auxLeerDoble();
        System.out.println("Escriba otro número");
        double num2 = auxLeerDoble();
        if (num1 > num2) {
            System.out.println("El orden de los números es " + num2 + " , " + num1);
        } else if (num1 < num2) {
            System.out.println("El orden de los números es " + num1 + " , " + num2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
    public static void ej15() {
        System.out.println("Escriba un número");
        double num1 = auxLeerDoble();
        System.out.println("Escriba otro número");
        double num2 = auxLeerDoble();
        System.out.println("Escriba otro número");
        double num3 = auxLeerDoble();
        if (num1 > num2) {
            System.out.println("El orden de los números es " + num2 + " , " + num1);
            if (num1 > num3) {
                System.out.println("El número más grande es el primer número" + num1);
            } else {
                System.out.println("El número más grande es el tercer número" + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("El número más grande es el segundo número" + num2);
            } else {
                System.out.println("El número más grande es el tercer número" + num3);
            }
        }
    }
    public static void ej16() {
        System.out.println("Escriba una nota");
        double num = auxLeerDoble();
        if (num >= 0 && num < 3) {
            System.out.println("Muy deficiente");
        } else if (num >= 3 && num < 5) {
            System.out.println("Insfuficiente");
        } else if (num >= 5 && num < 6) {
            System.out.println("Bien");
        } else if (num >= 6 && num < 9) {
            System.out.println("Notable");
        } else if (num >= 9 && num <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println(" El número introducido es incorrecto");
        }
    }
    public static void ej17() {
        System.out.println("Escribe una hora ");
        int hora = auxLeerEntero();
        System.out.println("Escribe los minutos ");
        int min = auxLeerEntero();
        System.out.println("Escribe los segundos ");
        int seg = auxLeerEntero();
        if (seg >= 0 && seg <= 59 && min >= 0 && min <= 59 && hora >= 0 && hora <= 23) {
            if (seg != 59) {
                int seg2 = seg + 1;
                System.out.println("La hora un segundo más es " + hora + ":" + min + ":" + seg2);
            } else if (seg == 59 && min != 59) {
                int seg3 = 00;
                int min2 = min + 1;
                System.out.println("La hora un segundo más es " + hora + ":" + min2 + ":" + seg3);
            } else if (seg == 59 && min == 59 && hora != 23) {
                int seg3 = 00;
                int min2 = 00;
                int hora2 = hora + 1;
                System.out.println("La hora un segundo más es " + hora2 + ":" + min2 + ":" + seg3);
            } else if (seg == 59 && min == 59 && hora == 23) {
                System.out.println("La hora un segundo más es 00:00:00");
            }
        } else {
            System.out.println("Has introducido una hora incorrecta");
        }
    }
    public static void ej18() {
        System.out.println("Calculador neto de salario semanal");
        System.out.println("Introduce las horas trabajadas de la semana");
        int hora = auxLeerEntero();
        double salario = 14.53 * hora;
        if (hora > 0 && hora <= 35) {
            if (salario <= 500) {
                System.out.println("Tu salario es:" + salario);
            } else if (salario > 500 && salario <= 900) {
                double tasa1 = salario * 0.25;
                System.out.println("El salario sin aplicar ningun impuesto es: " + salario);
                System.out.println("El salario con una tasa del 25% de impuestos es: " + tasa1);
            } else if (salario > 900) {
                double tasa2 = salario * 0.45;
                System.out.println("El salario sin aplicar ningun impuesto es: " + salario);
                System.out.println("El salario con una tasa del 45% de impuestos es: " + tasa2);
            }
        } else if (hora > 35) {
            double salario2 = salario * 1.5;
            if (salario <= 500) {
                System.out.println("Tu salario es:" + salario2);
            } else if (salario > 500 && salario <= 900) {
                double tasa1 = salario2 * 0.25;
                System.out.println("El salario sin aplicar ningun impuesto es: " + salario2);
                System.out.println("El salario con una tasa del 25% de impuestos es: " + tasa1);
            } else if (salario > 900) {
                double tasa2 = salario2 * 0.45;
                System.out.println("El salario sin aplicar ningun impuesto es: " + salario2);
                System.out.println("El salario con una tasa del 45% de impuestos es: " + tasa2);
            }
        } else {
            System.out.println("Has introducido unas horas erroneas");
        }
    }
    public static int auxLeerEntero(){
        int aux =teclado.nextInt();teclado.nextLine();
        return aux;
    }
    public static double auxLeerDoble(){
        double aux = teclado.nextDouble();teclado.nextLine();
        return aux;    
    }
}
