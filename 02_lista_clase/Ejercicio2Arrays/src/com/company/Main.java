package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int i;


        //Preguntar si es necsario, o como saber cuantos arrays van
        System.out.println("Cuantos datos quieres introducir?: ");
        n = Integer.parseInt(br.readLine());

        String letra;

        String[] numeroalumnos = new String[n];

        for (i = 0; i < n; i++) {
            numeroalumnos[i] = null;
        }

        do {
            for (i = 0; i < n; i++) {
                System.out.print("Introduce un nombre y apellidos: ");
                numeroalumnos[i] = br.readLine();

            }
        } while (i < n);

        //Preguntar si el bucle va aqui, o antes cuando se ponen nombres
        do {
            System.out.print("Introduce una letra para sacar el listado de alumnos: ");
            letra = br.readLine();

            for (i = 0; i < numeroalumnos.length; i++) {

                if (numeroalumnos[i].substring(0, 1).equalsIgnoreCase(String.valueOf(letra))) {

                    System.out.println(numeroalumnos[i]);

                }
            }


        } while (!letra.equalsIgnoreCase("fin"));

        System.out.println("Saliendo...");
    }
}
