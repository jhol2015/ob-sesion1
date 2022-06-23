package com.example.estruturacontrol.repeticion;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("El valor de i es: " + i);
        }

        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 7, 8};
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
