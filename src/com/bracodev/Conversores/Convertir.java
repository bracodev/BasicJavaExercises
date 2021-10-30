package com.bracodev.Conversores;

import java.util.Scanner;

public class Convertir
{
      final static String MENU = new StringBuilder()
            .append("***************************************** \n")
            .append("* CONVERSOREST * \n")
            .append("***************************************** \n")
            .append("[1] CONVERSOR CENTIGRADOS A FAHRENHEIT\n")
            .append("[2] NÚMEROS ROMANOS\n")
            .append("Elija una opción: ")
            .toString();

    public Convertir()
    {
        // Crear el menú
        System.out.print(MENU);

        Scanner sc =  new Scanner(System.in);
        int opcion = sc.nextInt();      // Declara y lee un entero por teclado

        switch (opcion) {
            case 1:
                Temperatura temp = new Temperatura();
                break;
            case 2:
                NumerosRomanos romanos = new NumerosRomanos();
                   break;
        } //swich

    }
}
