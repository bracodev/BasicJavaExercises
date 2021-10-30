package com.bracodev.Aritmetica;

import java.util.Scanner;

public class Enteros
{
    final static String MENU = new StringBuilder()
            .append("***************************************** \n")
            .append("*  OPERACIONES ARITMÉTICAS CON ENTEROS  * \n")
            .append("***************************************** \n")
            .append("Elija una opción: \n")
            .append("[1] SUMA\n")
            .append("[2] RESTA\n")
            .append("[3] MULTIPLICACIÓN\n")
            .append("[4] DIVISION")
            .toString();

    public static void main(String[] args){

    }

    /**
     * Crea el menú
     */
    public  void crearMenu()
    {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        // Crear el menú
        System.out.println(MENU);
        opcion = sc.nextInt();      // lee un entero por teclado

        switch (opcion) {
            case 1:
                this.suma();
                break;
            case 2:
                this.resta();
                break;
            case 3:
                this.multiplicacion();
                break;
            case 4:
                this.division();
                break;
        }
    }

    /**
     * Sumar dos números enteros
     */
    public void suma()
    {
        int n1 = 0, n2 = 0, res;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.print("N1: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.print("N2: ");
        n2 = sc.nextInt();      //lee un entero por teclado

        res = n1 + n2;

        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void resta()
    {
        int n1 = 0, n2 = 0, res;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.print("N1: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.print("N2: ");
        n2 = sc.nextInt();      //lee un entero por teclado

        res = n1 - n2;

        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void multiplicacion()
    {
        int n1 = 0, n2 = 0, res;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.print("N1: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.print("N2: ");
        n2 = sc.nextInt();      //lee un entero por teclado

        res = n1 * n2;

        System.out.println("Resultado: " + res);
    }

    /**
     * Multiplicar dos números enteros
     */
    public void division()
    {
        int n1 = 0, n2 = 0, res;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.print("N1: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.print("N2: ");
        n2 = sc.nextInt();      //lee un entero por teclado

        res = n1 / n2;

        System.out.println("Resultado: " + res);
    }
}
