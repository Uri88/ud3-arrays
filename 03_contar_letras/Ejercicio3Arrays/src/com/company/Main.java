package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void contarLetras(String textousu, String abc, int[] recuento) {


       /* char[] cuentaabecedario = abc.toCharArray();
        char[] cuentatexto = textousu.toCharArray();*/


        for (int i = 0; i < textousu.length(); i++) {
            char letra = textousu.charAt(i);


            for (int j = 0; j < abc.length(); j++) {
                if (abc.charAt(j) == letra) {
                    recuento[j] += 1;
                }
            }
        }

     /*   //Compara una letra del abecedario con una del texto y suma si son iguales
        for (int i = 0; i < cuentatexto.length; i++) {

            for (int j = 0; j < cuentaabecedario.length; j++) {

                if (cuentatexto[i] == cuentaabecedario[j]) {

                    recuento[i]++;

                }
            }
        }*/

    }

    public static void visualizarRecuento(String abc, int[] recuento) {

        for (int i = 0; i < recuento.length; i++) {
            if (recuento[i] > 0) {
                System.out.println(abc.charAt(i) + ": " + recuento[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Introduce un texto: ");
        String textousu = br.readLine().toUpperCase();

        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        int[] recuento = new int[abc.length()];

        contarLetras(textousu, abc, recuento);

        visualizarRecuento(abc, recuento);



       /* Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.

        El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.

                Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().

                Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().*/


    }
}
