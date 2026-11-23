import java.util.Scanner;
public class ejcondicionalesestra {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bateria ejercicios en java");
        int ejercicioSeleccionado;
        do {
            System.out.println("Selecciona cual quieres ejecutar (1-10) o 0 para salir");
            ejercicioSeleccionado = auxLeerEntero();
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
        System.out.println("Bienvenido al generador de triángulos");
        System.out.println("Introduce la longitud número 1");
        double l1 = auxLeerDoble();
        System.out.println("Introduce la longitud número 2");
        double l2 = auxLeerDoble();
        System.out.println("Introduce la longitud número 3");
        double l3 = auxLeerDoble();
        double verificar = l1 + l2;
        if (l1 > 0 && l2 > 0 && l3 > 0) {
            if (verificar > l3) {
                if (l1 == l2 && l2 == l3) {
                    System.out.println("El triángulo es equiátero");
                } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                    System.out.println("El triángulo es isósceles");
                } else {
                    System.out.println("El triángulo es escaleno");
                }
            } else {
                System.out.println("Los lados introducidos son incorrectos");
            }
        } else {
            System.out.println("Los lados introducidos son incorrectos");
        }
    }
    public static void ej2() {
        System.out.println("Introduce el número que corresponde a un mes del año (ejemplo: enero = 1):");
        int mes = auxLeerEntero();
        System.out.println("Introduce un año:");
        int anio = auxLeerEntero();
        if (mes >= 1 && mes <= 12) {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("El mes " + mes + " tiene 30 días");
            } else if (mes == 2) {
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    System.out.println("El mes tiene 29 días");
                } else {
                    System.out.println("El mes tiene 28 días");
                }
            } else {
                System.out.println("El mes tiene 31 días");
            }
        } else {
            System.out.println("El mes introducido es incorrecto");
        }
    }
    public static void ej3() {
        System.out.println("Introduce un dia del año");
        int dia = auxLeerEntero();
        System.out.println("Introduce un mes del año");
        int mes = auxLeerEntero();
        System.out.println("Introduce un año ");
        int anio = auxLeerEntero();
        if (mes >= 1 && mes <= 12) {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                } else {
                    System.out.println("La fecha introducida es incorrecta");
                }
            } else if (mes == 2) {
                if (dia >= 1 && dia <= 29) {
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) && dia == 29) {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                    } else if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) && dia == 28) {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                    } else {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                    }
                } else {
                    System.out.println("La fecha introducida es incorrecta");
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                } else {
                    System.out.println("La fecha introducida es incorrecta");
                }
            } else {
                System.out.println("La fecha introducida es incorrecta");
            }
        } else {
            System.out.println("La fecha introducida es incorrecta");
        }
    } // dar una vuelta pra reducir numero de ifs y else ej3bis
    public static void ej4() {
        System.out.println("Introduce los minutos que has estado en el parking aparcado");
        int min = auxLeerEntero();
        if (min > 0 && min <= 30) {
            System.out.println("Los primeros 30 minutos son gratis");
        } else if (min >= 31 && min <= 120) {
            double pago = (min - 30) * 0.05;
            System.out.println("Tienes que pagar " + pago + "euroS");
        } else if (min >= 121 && min <= 360) {
            double pago = (min - 30) * 0.03;
            System.out.println("Tienes que pagar " + pago + " euros");
        } else if (min >= 361) {
            int dia = (min - 30) / 1440;
            int tarifa = dia * 18;
            if (dia < 1) {
                System.out.println("Tienes que pagar la tarifa diaria que son 18 euros");
            } else {
                System.out.println("La tarifa que tienes que pagar es " + tarifa + "euros");
            }
        } else {
            System.out.println("Has introducido un dato erroneo");
        }
    } // rehacer con criterio profe ej4bis  
    public static void ej5() {
        System.out.println("Introduce el eje x del plano");
        int x = auxLeerEntero();
        System.out.println("Introduce el eje y del plano");
        int y = auxLeerEntero();
        if (x == 0 && y == 0) {
            System.out.println("Estas en el origen: (" + x + "," + y + ")");
        } else if (y == 0) {
            System.out.println("El punto seleccionado esta en el eje x, en las coordenadas: (" + x + "," + y + ")");
        } else if (x == 0) {
            System.out.println("El punto seleccionado esta en el eje y, en las coordenadas: (" + x + "," + y + ")");
        } else if (x > 0 && y > 0) {
            System.out.println(
                    "El punto seleccionado esta en el primer cuadrante, en las coordenadas: (" + x + "," + y + ")");
        } else if (x < 0 && y > 0) {
            System.out.println(
                    "El punto seleccionado esta en el segundo cuadrante, en las coordenadas: (" + x + "," + y + ")");
        } else if (x < 0 && y < 0) {
            System.out.println(
                    "El punto seleccionado esta en el tercer cuadrante, en las coordenadas: (" + x + "," + y + ")");
        } else if (x > 0 && y < 0) {
            System.out.println(
                    "El punto seleccionado esta en el cuarto cuadrante, en las coordenadas: (" + x + "," + y + ")");
        }
    }
    public static void ej6() {
        System.out.println("Introduce la categoria de la que perteneces (vip o estandard)");
        String categoria = auxLeerString();
        System.out.println("Introduce el importe de la compra: ");
        double precio = auxLeerDoble();
        if (categoria.equals("vip")) {
            double preciovip = precio * 0.15;
            if (precio > 0 && precio <= 200) {
                System.out.println("El importe a pagar es " + preciovip);
            } else if (precio > 200) {
                double resultado = preciovip * 0.2;
                System.out.println("El importe a pagar es " + resultado);
            } else {
                System.out.println("El precio introducido no es válido");
            }
        } else if (categoria.equals("estandard")) {
            double preciostandard = precio * 0.05;
            if (precio > 0 && precio <= 200) {
                System.out.println("El importe a pagar es " + preciostandard);
            } else if (precio > 200) {
                double resultado = preciostandard * 0.1;
                System.out.println("El importe a pagar es " + resultado);
            } else {
                System.out.println("El precio introducido no es válido");
            }
        } else {
            System.out.println("La categoria introducida no es valida");
        }
    }
    public static void ej7() {
        System.out.println("Bienvenido al juego piedra, papel o tijera, escribe terminar para terminar el juego");
        System.out.println("Jugador uno");
        String j1 = auxLeerString();
        System.out.println("Jugador dos");
        String j2 = auxLeerString();
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else if (j1.equals("piedra") && j2.equals("papel")) {
            System.out.println("Ha ganado el jugador 2");
        } else if (j2.equals("piedra") && j1.equals("papel")) {
            System.out.println("Ha ganado el jugador 1");
        } else if (j1.equals("piedra") && j2.equals("tijera")) {
            System.out.println("Ha ganado el jugador 1");
        } else if (j2.equals("piedra") && j1.equals("tijera")) {
            System.out.println("Ha ganado el jugador 2");
        } else if (j1.equals("papel") && j2.equals("tijera")) {
            System.out.println("Ha ganado el jugador 2");
        } else if (j2.equals("papel") && j1.equals("tijera")) {
            System.out.println("Ha ganado el jugador 1");
        } else {
            System.out.println("Has introducido un valor erroneo");
        }
    }
    public static void ej8() {
        System.out.println("Ordenador de 3 numeros");
        System.out.println("Introduce el primer número");
        int num1 = auxLeerEntero();
        teclado.nextLine();
        System.out.println("Introduce el segundo número");
        int num2 = auxLeerEntero();
        teclado.nextLine();
        System.out.println("Introduce el tercer número");
        int num3 = auxLeerEntero();
        teclado.nextLine();
        if (num1 > num2 && num2 > num3) {
            System.out.println("El orden de los tres numeros es: " + num1 + "," + num2 + "," + num3);
        } else if (num1 < num2 && num2 > num3 && num1 < num3) {
            System.out.println("El orden de los tres numeros es: " + num2 + "," + num3 + "," + num1);
        } else if (num1 < num2 && num2 > num3 && num1 > num3) {
            System.out.println("El orden de los tres numeros es: " + num2 + "," + num1 + "," + num3);
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("El orden de los tres numeros es: " + num3 + "," + num2 + "," + num1);
        } else {
            System.out.println("Has introducido algún número igual");
        }
    }
    public static void ej9() {
        System.out.println("Salario con horas nocturnas");
        System.out.println("Introduce las horas trabajadas en turo diurno");
        int horaD = auxLeerEntero();
        System.out.println("Introduce las horas trabajadas en turo nocturno");
        int horaN = auxLeerEntero();
        int horas = horaN + horaD;
        int diurna = horaD * 10;
        int nocturna = horaN * 15;
        if (horas > 0) {
            if (horas > 40) {
                double extraD = diurna * 05;
                double extraN = nocturna * 05;
                double total1 = extraD + extraN;
                System.out.println("El sueldo total es: " + total1);
                System.out.println("El sueldo correspondiente por horas diuras es: " + extraD);
                System.out.println("El sueldo correspondiente por horas nocturnas es: " + extraN);
            } else {
                double total = diurna + nocturna;
                System.out.println("El sueldo total es: " + total);
                System.out.println("El sueldo correspondiente por horas diuras es: " + diurna);
                System.out.println("El sueldo correspondiente por horas nocturnas es: " + nocturna);
            }
        } else {
            System.out.println("Has introducido una hora incorrecta");
        }
    }

    public static void ej10() {
        System.out.println("Calculo del IMC");
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce tu peso en kg");
        double peso = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce tu altura en metros");
        double altura = teclado.nextDouble();
        teclado.nextLine();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            if (edad > 65) {
                System.out.println("Tu indice corporal es: " + imc);
                System.out.println(" Estas en bajo peso. Tu salud corre peligro");
            } else {
                System.out.println("Tu indice corporal es: " + imc);
                System.out.println("Bajo peso.");
            }
        } else if (imc <= 18.5 && imc < 25) {
            System.out.println("Tu indice corporal es: " + imc);
            System.out.println("Peso normal");
        } else if (imc <= 25 && imc < 30) {
            System.out.println("Tu indice corporal es: " + imc);
            System.out.println("Sobrepeso");
        } else if (imc <= 30) {
            System.out.println("Tu indice corporal es: " + imc);
            System.out.println("Obesidad");
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
    public static String auxLeerString(){
        String aux = teclado.nextLine().toLowerCase();
        return aux;
    }
}
