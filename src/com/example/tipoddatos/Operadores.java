package com.example.tipoddatos;

import java.text.NumberFormat;

public class Operadores {
    public static void main(String[] args) {
        // aritimetico
        int num1 = 10;
        int num2 = 20;
        int resultadoSuma = num1 + num2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = num1 - num2;

        // comparacion
        boolean result1 = num1 > num2;
        System.out.println(result1);

        boolean result2 = num1 < num2;
        System.out.println(result2);

        // Lógicos
        boolean result3 = num1 > 5 && num1 < 30;

        int edad = 17;
        boolean carnetJoven = edad > 15 && edad <= 26;
    }
}
