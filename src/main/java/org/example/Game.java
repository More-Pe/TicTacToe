package org.example;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public Game() {
        board = new Board();
        scanner = new Scanner(System.in);

        System.out.print("Nombre del Jugador 1 (🦋): ");
        String name1 = scanner.nextLine();
        System.out.print("Nombre del Jugador 2 (🌸): ");
        String name2 = scanner.nextLine();

        player1 = new Player(name1, "🦋");
        player2 = new Player(name2, "🌸");
    }

    public void start() {
        Player currentPlayer = player1;

        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") - Tu turno");

            int row, col;
            while (true) {
                System.out.print("Fila (0-2): ");
                row = scanner.nextInt();
                System.out.print("Columna (0-2): ");
                col = scanner.nextInt();

                if (row >= 0 && row <= 2 && col >= 0 && col <= 2 &&
                        board.placeMark(row, col, currentPlayer.getSymbol())) {
                    break;
                } else {
                    System.out.println("Movimiento inválido. Intenta de nuevo.");
                }
            }

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("🎉 ¡" + currentPlayer.getName() + " ha ganado!");
                break;
            } else if (board.isFull()) {
                board.printBoard();
                System.out.println("🤝 ¡Empate!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}
