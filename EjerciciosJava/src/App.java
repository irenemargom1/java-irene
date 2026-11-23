public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 5;
        int b = 7;
        int c = a+b;
        System.out.println("El resultado es " + c);
        
        c = a-b; //REUTILIZO LA VARIABLE "c" para probar la resta
        System.out.println("El resultado es " + c);

        double numComa = 0.7;
        double d = a + numComa; // La suma de un int y double tiene que ser un double
        System.out.println("El resultado es " + d);
        
        suma();
    }// Fin de metodo main

    public static void suma(){
        int a = 8;
        int b = 7;
        int c = a+b;
        System.out.println("El resultado es " + c); //suma dentro de un metodo
    }
    
} // Fin de clase APP
