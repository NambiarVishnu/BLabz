package com.project.assignment.day7;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


        private static final char PLAYER = 'X';
        private static final char COMPUTER = 'O';
        private static final char EMPTY = ' ';
        private static char[][] board = new char[3][3];
        private static Random random = new Random();

        public static void main(String[] args) {
            initializeBoard();
            printBoard();

            while (true) {
                userMove();
                if (checkWinner(PLAYER)) {
                    printBoard();
                    System.out.println("You win!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                computerMove();
                if (checkWinner(COMPUTER)) {
                    printBoard();
                    System.out.println("Computer wins!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                printBoard();
            }
        }

        // Initialize the board with empty spaces
        private static void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = EMPTY;
                }
            }
        }

        // Print the current state of the board
        private static void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        // Allow the user to make a move
        private static void userMove() {
            Scanner scanner = new Scanner(System.in);
            int row, col;

            while (true) {
                System.out.println("Enter row (1-3) and column (1-3) for your move: ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                    board[row][col] = PLAYER;
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
        }

        // Let the computer make a random move
        private static void computerMove() {
            int row, col;

            while (true) {
                row = random.nextInt(3);
                col = random.nextInt(3);

                if (board[row][col] == EMPTY) {
                    board[row][col] = COMPUTER;
                    break;
                }
            }
            System.out.println("Computer's move:");
        }

        // Check if the given player has won
        private static boolean checkWinner(char player) {
            // Check rows, columns, and diagonals
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    return true; // Row match
                }
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                    return true; // Column match
                }
            }

            // Check diagonals
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            }

            return false;
        }

        // Check if the board is full
        private static boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }
    }


