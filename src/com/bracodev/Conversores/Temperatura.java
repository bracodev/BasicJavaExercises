package com.bracodev.Conversores;

import java.util.Scanner;

public class Temperatura
{
    public Temperatura()
    {
        Scanner sc = new Scanner(System.in);

        float gradosC, gradosF;

        System.out.print("Temperatura: ");
        gradosC = sc.nextFloat();
        gradosF = 32 + (9 * gradosC / 5);

        System.out.println(gradosC +" ºC = " + gradosF + " ºF");
    }



}
