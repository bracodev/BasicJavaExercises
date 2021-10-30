package com.bracodev.Aritmetica;

import java.io.IOException;
import java.util.Scanner;

public class Decimales
{
    final static String MENU = new StringBuilder()
            .append("***************************************** \n")
            .append("* OPERACIONES ARITMÉTICAS CON DECIMALES * \n")
            .append("***************************************** \n")
            .append("[1] SUMA\n")
            .append("[2] RESTA\n")
            .append("[3] MULTIPLICACIÓN\n")
            .append("[4] DIVISION\n")
            .append("Elija una opción: ")
            .toString();

    public Decimales (){
        this.crearMenu();
    }

    /**
     * Crea el menú
     */
    public  void crearMenu()
    {
        int opcion = 0;
        float n1, n2;
        Scanner sc = new Scanner(System.in);

        // Crear el menú
        System.out.print(MENU);
        opcion = sc.nextInt();      // lee un entero por teclado

        //leer el primer número
        System.out.print("N1: ");
        n1 = sc.nextFloat();      // Lee un Float por teclado

        //leer el segundo número
        System.out.print("N2: ");
        n2 = sc.nextFloat();      // Lee un Float por teclado

        switch (opcion) {
            case 1:
                this.suma(n1, n2);
                break;
            case 2:
                this.resta(n1, n2);
                break;
            case 3:
                this.multiplicacion(n1, n2);
                break;
            case 4:
                this.division(n1, n2);
                break;
        }
    }

    /**
     * Sumar dos números enteros
     */
    public void suma(float n1, float n2)
    {
        float res = n1 + n2;
        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void resta(float n1, float n2)
    {
        float res = n1 - n2;
        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void multiplicacion(float n1, float n2)
    {
        float res = n1 * n2;
        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void division(float n1, float n2)
    {
        float res = n1 / n2;
        System.out.println("Resultado: " + res);
    }
}
