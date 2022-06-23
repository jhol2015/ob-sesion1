package com.example.funciones;

public class Funciones {
    public static void main(String[] args) {

        // opcion 1: funcion sin parámetros y sin tipo de retorno
        showMenu();

        //opcion 2: funcion sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);
        System.out.println(getPrice());
        
        //opcion 3: funcion com parametros y sin tipo de retorno
        imprimirSaludo("OpenBootcamp");

        //opcion 4: funcion con parametros y con tipo de retorno
        String nombre = "Alan";
        String apellido = "Sastre";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);
    }

    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes" + nombre + apellido;
    }

    static void imprimirSaludo(String openBootcamp) {
        System.out.println();
    }

    static double getPrice() {
        return 100.99;
    }

    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas.");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Compar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas: ";
    }
}
