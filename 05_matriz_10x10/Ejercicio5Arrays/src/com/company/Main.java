package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();


	int [] [] diez = new int [10] [10];

        for (int i = 0; i < diez.length; i++) {
            for (int j = 0; j < diez.length; j++) {
                diez [i][j] = r.nextInt(100);
            }

        }

        for (int i = 0; i < diez.length; i++) {
            for (int j = 0; j < diez.length; j++) {
                System.out.format("%2d, ", diez[i] [j]);
            }
            System.out.println();
        }
    }
}
