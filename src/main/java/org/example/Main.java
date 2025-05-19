package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a0 = '_';
        char a1 = '_';
        char a2 ='_';
        char b0 = '_';
        char b1 = '_';
        char b2 ='_';
        char c0 = '_';
        char c1 = '_';
        char c2 ='_';
        System.out.println("Juguemos Tic Tac Toe\nEl tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2");
        System.out.println("\t" + a0 +" "+ a1 + " " + a2 + "\n\t" + b0 + " " + b1 + " " + b2 + "\n\t" +  c0 + " " + c1 + " " + c2);
        int playerFirstMove = scanner.nextInt();
        switch (playerFirstMove) {
            case 00:
                a0 = 'X';
        } //Completar case con los demás casos
        System.out.println("\t" + a0 +" "+ a1 + " " + a2 + "\n\t" + b0 + " " + b1 + " " + b2 + "\n\t" +  c0 + " " + c1 + " " + c2);
    }
}