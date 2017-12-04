package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variables

        //Aleatorios
        Random r = new Random();

        String respuestausu = null;
        String respuestaaci = null;
        String respuestafin = null;
        int recuaci = 0;
        int recufallo = 0;

        //Preguntas

        String[] preguntas = {
                "Ciencia: Cual es la velocidad de la luz? (en m/s): ",
                "Geografia: Cuantas comunidades autonomas hay en España?: ",
                "Historia: Que Emperador romano fue apuñalado en el Senado?: ",
                "Entretenimiento: Con que nombre se conoce a los musicos que conforman la banda de musica Ghost?: ",
                "Deporte: Ha ganado el Baskonia alguna Copa de Europa de baloncesto?: ",
                "Arte: En que museo se encuentra 'Las Meninas': "
        };


        //Respuestas

        String[] respuestas = {
                "299 792 458 m/s",
                "17",
                "Julio Cesar",
                "Nameless Ghouls",
                "No",
                "Museo del Prado"
        };

        do {

            //Mostrar pregunta y recoger respuesta usuario
            int aleatorio = r.nextInt(preguntas.length);

            System.out.print(preguntas[aleatorio]);
            respuestausu = br.readLine();

            //Mostrar respuesta
            System.out.println(respuestas[aleatorio]);

            //Preguntar a usuario si ha acertado
            System.out.print("Has acertado?: ");
            respuestaaci = br.readLine().toLowerCase();

            //Contar respuestas correctas e incorrectas
            if (respuestaaci.equalsIgnoreCase("si")) {
                recuaci++;

            } else {
                recufallo++;
            }

            System.out.println("Quieres seguir?: ");
            respuestafin = br.readLine().toLowerCase();


        } while (respuestafin.equalsIgnoreCase("si"));

        System.out.println("Numero de aciertos: " + recuaci);
        System.out.println("Numero de fallos: " + recufallo);
        System.out.println("Gracias por jugar");


    }
}
