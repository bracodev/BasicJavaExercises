package com.bracodev.Ejercicios;

import java.util.Scanner;

/**
 * leer la altura de N personas y calcular la altura media.
 * Calcular cuántas personas tienen una altura superior a la media
 * y cuántas tienen una altura inferior a la media.
 * El valor de N se pide por teclado y debe ser entero positivo.
 *
 * @author bracodev
 */
public class Ejercicio_N2
{
    public void init()
    {
        Scanner sc = new Scanner(System.in);
        int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;

        //Leer el número de personas
        do{
            System.out.print("Número de personas: ");
            N = sc.nextInt();
        }while(N<=0);

        //Se crea el array de tamaño N
        double[] alto = new double[N];

        //Leer alturas
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; //se suma la estatura leída para calcular la media
        }

        //Calcular la media
        media = media / N;

        //recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMas++;
            } else if (alto[i] < media){ //si es menor
                contMenos++;
            }
        }

        //Mostrar resultados
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);
    }
}
