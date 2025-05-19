package org.example;

public class Board {
    private String[][] board;

    public Board() {
        board = new String[3][3];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = " ";
    }

    public boolean placeMark(int row, int col, String symbol) {
        if (board[row][col].equals(" ")) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (String[] row : board)
            for (String cell : row)
                if (cell.equals(" "))
                    return false;
        return true;
    }

    public boolean checkWin(String symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0].equals(symbol) && board[i][1].equals(symbol) && board[i][2].equals(symbol)) ||
                    (board[0][i].equals(symbol) && board[1][i].equals(symbol) && board[2][i].equals(symbol))) {
                return true;
            }
        }

        return (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) ||
                (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol));
    }

    public void printBoard() {
        System.out.println("-------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] + " | ");
            System.out.println();
            System.out.println("-------------------------");
        }
    }
}

