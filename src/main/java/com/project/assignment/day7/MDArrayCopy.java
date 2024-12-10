package com.project.assignment.day7;

public class MDArrayCopy {
        public static void main(String[] args) {
            int[][] sourceMatrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int rows = sourceMatrix.length;
            int cols = sourceMatrix[0].length;
            int[][] destinationMatrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    destinationMatrix[i][j] = sourceMatrix[i][j];
                }
            }

            System.out.println("Copied Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(destinationMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


