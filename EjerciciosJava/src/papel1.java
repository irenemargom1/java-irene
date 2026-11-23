import java.util.Scanner;
public class papel1 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio1();
        teclado.close();
    }
    public static int auxLeerEntero(){
        int aux =teclado.nextInt();teclado.nextLine();
        return aux;
    }
    public static void ejercicio1(){
        System.out.println("INTRODUCE UN DIA DE LA SEMANA DEL 1-7, ESCRIBE 0 PARA SALIR");
        int dia=auxLeerEntero();
        while (dia!=0) {
            if (dia==1){
                System.out.println("ES LUNES"); 
            }
            else if (dia==2){
                System.out.println("ES martes");
            }
            else if (dia==3){
                System.out.println("ES mier"); 
            }
            else if (dia==4){
                System.out.println("ES jueves"); 
            }
            else if (dia==5){
                System.out.println("ES vierns"); 
            }
            else if (dia==6){
                System.out.println("ES sabado"); 
            }
            else if (dia==7){
                System.out.println("ES domingo"); 
            }
            else{
                System.out.println("Introduce un numero valido");
            }
            dia=auxLeerEntero();
        }
        System.out.println("FIN DEL PROGRAMA");
        
    }
}
