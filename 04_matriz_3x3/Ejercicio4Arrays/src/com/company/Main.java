package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int [] [] tres = new int [3] [3];

        for (int i = 0; i < tres.length; i++) {
            for (int j = 0; j < tres.length; j++) {
                System.out.print("Introduce un valor: ");
                tres [i] [j] = Integer.parseInt(br.readLine());
            }
        }

        for (int i = 0; i < tres.length; i++) {
            for (int j = 0; j < tres.length; j++) {
                System.out.format("%d ", tres[i][j]);
            }
            System.out.println();
        }
    }
}
