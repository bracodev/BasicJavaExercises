package com.bracodev;

import com.bracodev.Aritmetica.Enteros;
import com.bracodev.Aritmetica.Decimales;
import com.bracodev.Conversores.Convertir;
import com.bracodev.Conversores.Temperatura;
import com.bracodev.Geometria.Areas;

import java.util.InputMismatchException;
import java.util.Scanner;   // Importación de la clase Scanner para leer datos ingresados por el teclado

public class Main {

    private byte _byte = 1;             // Ocupa 8 bits con signo. Puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).
    private short _short = 1;           // Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.
    private int _int = 1;               // Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -231 y el valor máximo 231-1.
    private long _long = 1;             // Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -263 a 263-1
    private float _float = 1;           // Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
    private double _double = 1;         // Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
    private boolean _boolean = true;    // Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.
    private char _char = 1;             // Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.

    private Integer _integer = 1;       // Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.
    private String _string = "";        // Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.

    final int CONSTANTE_INT = 100;          // Constante de tipo Entero

    final static String MENU = new StringBuilder()
            .append("***************************************** \n")
            .append("*            MENÚ DE OPCIONES           *\n")
            .append("***************************************** \n")
            .append("[1] OPERACIONES ARITMETICAS CON ENTEROS\n")
            .append("[2] OPERACIONES ARITMETICAS CON DECIMALES\n")
            .append("[3] CONVERSORES\n")
            .append("[4] GEOMETRÍA\n")
            .append("[0] FINALIZAR\n")
            .append("Elija una opción: ")
            .toString();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Crea una isntancia para la entrada de datos
        int opcion; // Almacena la opción seleccionada
        boolean finalizar = false;

        while (!finalizar) {

            /// Leer la opción del menú
            System.out.println();
            System.out.print(MENU);
            opcion = sc.nextInt();      //lee un entero por teclado
            System.out.println();

            try {
                switch (opcion) {
                    case 1:
                        Enteros operacionEnteros = new Enteros(); // Instancia a la clase Enteros
                        operacionEnteros.crearMenu(); // Llamada al método de crear menú
                        break;

                    case 2:
                        Decimales operacionDecimales = new Decimales(); // Instancia a la clase Deciamles
                        break;

                    case 3:
                        Convertir convertir = new Convertir(); // Instancia a la clase Cent2Fahr
                        break;

                    case 4:
                        Areas areas = new Areas(); // Instancia a la clase Cent2Fahr
                        break;

                    case 0:
                        finalizar = true;
                        break;

                    default:
                        System.out.println("Opción inválida");
                        break;
                } //swich

                sc.nextLine(); // Limpiar el buffer

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un valor numérico");
                sc.next();
            }
        } // while
    }
}
