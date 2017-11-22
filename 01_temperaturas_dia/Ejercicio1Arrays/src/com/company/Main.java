package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double media(double max, double min) {


        return (max + min) / 2;
    }


    public static void main(String[] args) throws IOException {


        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        final int n = 24;
        double temperatura = 0;

        double[] numeros;
        numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }


        for (int i = 0; i < n; i++) {
            System.out.print("Introduce una temperatura: ");
            temperatura = Double.parseDouble(br.readLine());

            numeros[i] = temperatura;


            if (temperatura > max) {

                max = temperatura;

            }
            if (temperatura < min) {

                min = temperatura;
            }

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < (int)numeros[i]; j++) {
                System.out.print(" * ");
            }
            System.out.print(" " + numeros[i]);

            if (numeros[i]==max){

                System.out.print(" <--- Max");
            }

            if (numeros[i]==min){

                System.out.print(" <--- Min");
            }

            System.out.println();
        }

        System.out.println();
      /*  System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);*/
        System.out.println("Media: " + media(max, min));


    }
}