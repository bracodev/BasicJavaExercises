package com.bracodev.Geometria;

import java.util.*;
import java.util.Scanner;

public class Areas
{
    private Scanner sc;

    final static String MENU = new StringBuilder()
            .append("***************************************** \n")
            .append("*          FIGURAS GEOMÉTRICAS          * \n")
            .append("***************************************** \n")
            .append("[1] Área de un circunferencia\n")
            .append("[3] Calcular Hipotenusa\n")
            .append("Elija una opción: ")
            .toString();

    public Areas(){

        sc = new Scanner(System.in);
        int opcion = 0;

        // Crear el menú
        System.out.println(MENU);
        opcion = sc.nextInt();      // lee un entero por teclado

        switch (opcion) {
            case 1:
                this.areaCircunferencia();
                break;
            case 2:
                this.hipotenusa();
                break;
            /*case 3:
                this.pitagoras();
                break;
            case 4:
                this.pitagoras();
                break;*/
        }
    }

    public void areaCircunferencia()
    {
        double radio, longitud, area;

        System.out.print("Introduce radio de la circunferencia: ");
        radio = sc.nextDouble();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Area de la circunferencia: " + area);
    }

    public void hipotenusa()
    {
        double cateto1, cateto2, hipo;

        System.out.print("Cateto A: ");
        cateto1 = sc.nextDouble();

        System.out.print("Cateto B: ");
        cateto2 = sc.nextDouble();

        hipo = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));

        System.out.println("Hipotenusa: " +  hipo);
    }


    public void pitagoras()
    {
        String opcion;
        float a,b,c;

        System.out.print("Ingresa el valor que buscas [A] Cateto 1, [B] Cateto 2, [H] Hipotenusa");
        opcion = sc.next().toString().toUpperCase(); // Convierte la letra en mayuscula

        if( opcion.equals("H") ){
            hipotenusa();
        }
        else if( opcion.equals("A") || opcion.equals("B") ){
            catetos();
        }
    }

    public void catetos(){
        double cateto1, cateto2, hipo;

        System.out.println("Ingresa el valor de la hipotenusa");
        hipo = sc.nextFloat();

        System.out.println("Ingresa el valor del cateto");
        cateto1 = sc.nextFloat();

        cateto2 = Math.sqrt( hipo * hipo - cateto1 * cateto1 );

        System.out.println("El valor de a es  " + cateto2);
    }



}
