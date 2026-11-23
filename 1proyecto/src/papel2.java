import java.util.Scanner;
public class papel2{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
	
	ejercicio3();
	teclado.close();
	}

 //EJERCICIO
	public static void ejercicio3(){
		System.out.println("Introduce un numero para crear su tabla de multiplicar");
		int num1=auxLeerEntero();
		int mult;
		int fallo=0;
        boolean mal=false;
		int i=0;
		while(num1>=0 && i<=10){
			mult=num1*i;
			System.out.println("dime el resultado de la siguiente multiplicación");
			System.out.println(num1 + "x" + i + "=" );
			int resultado =auxLeerEntero();
			if (mult==resultado){
				System.out.println("Has acertado");
			}
			else{
				fallo++;
				mal=true;
			}
			i++;
		}
		if(mal){
            if(fallo==11){
                System.out.println("TIENES QUE ESTUDIAR MAS HAS TENIDO TODAS MAL");
            }
			System.out.println("HAS TENIDO MAL " + fallo);
		}
		else{
			System.out.println("ENHORABUENA NO HAS TENIDO NINGUN FALLO");
		}

    }
	public static void ejercicio4(){
		
	}  

//METODOS AUXILIARES
	public static int auxLeerEntero(){
		int aux = teclado.nextInt();teclado.nextLine();
		return aux;
	}
}

