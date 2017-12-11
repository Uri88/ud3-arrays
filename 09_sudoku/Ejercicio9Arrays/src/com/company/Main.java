package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variables
        String salir;
        int numusu = 0;
        final int vacio = 0;
        int filausu;
        int columnausu;
        int recuento = 29;

        //Creacion array y asignacion valores
        int[][] matrizsudoku = {
                {5, 3, vacio, vacio, 7, vacio, vacio, vacio, vacio},
                {5, vacio, vacio, 1, 9, 5, vacio, vacio, vacio},
                {vacio, 9, 8, vacio, vacio, vacio, vacio, 6, vacio},
                {8, vacio, vacio, vacio, 6, vacio, vacio, vacio, 3},
                {4, vacio, vacio, 8, vacio, 3, vacio, vacio, 1},
                {7, vacio, vacio, vacio, 2, vacio, vacio, vacio, 6},
                {vacio, 6, vacio, vacio, vacio, vacio, 2, 8, vacio},
                {vacio, vacio, vacio, 4, 1, 9, vacio, vacio, 5},
                {vacio, vacio, vacio, vacio, 8, vacio, vacio, 7, 9},
        };

        //Jugar sudoku
        do {

            //Mostrar tablero
            visualizarTablero(matrizsudoku);
            System.out.println();

            //Interaccion usuario
            System.out.print("Introduce una fila (0-8): ");
            filausu = Integer.parseInt(br.readLine());
            System.out.print("Introduce una columna (0-8): ");
            columnausu = Integer.parseInt(br.readLine());
            System.out.print("Introduce un numero (1-9): ");
            numusu = Integer.parseInt(br.readLine());
            System.out.println();

            //Asignar valores al tablero
            if (matrizsudoku[filausu][columnausu] == 0) {
                for (int fila = 0; fila < matrizsudoku.length; fila++) {
                    for (int columna = 0; columna < matrizsudoku[fila].length; columna++) {
                        matrizsudoku[filausu][columnausu] = numusu;
                        recuento++;
                    }
                }
            } else {
                System.out.println("Ya hay un numero escrito, prueba en otra fila y columna");
                System.out.println();
            }
            //Mostrar tablero
            visualizarTablero(matrizsudoku);

            //Continuar jugando
            System.out.println();
            System.out.print("Escribe 'FIN' para terminar: ");
            salir = br.readLine().toLowerCase();
            System.out.println();

            //No funciona la condicion fin
        } while (!salir.equalsIgnoreCase("fin") && recuento != 81);

        System.out.println("Saliendo...");

    }

    //Funcion para visualizar el tablero
    private static void visualizarTablero(int[][] matrizsudoku) {
        for (int i = 0; i < matrizsudoku.length; i++) {
            for (int j = 0; j < matrizsudoku[i].length; j++) {
                System.out.format("|%d| ", matrizsudoku[i][j]);
            }
            System.out.println();
        }
    }
}
