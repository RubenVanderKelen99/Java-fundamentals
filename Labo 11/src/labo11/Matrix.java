/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class Matrix {

    int[][] array;
    int rijen;
    int kolommen;

    /**
     *
     * @param matrix
     */
    public Matrix(int[][] matrix) {
        this.array = matrix;
        this.rijen = matrix.length;
        this.kolommen = matrix[0].length;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public String printMatrix(int[][] matrix) {
        String str = "";
        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                str += matrix[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    public int[] rijSommen(int[][] matrix) {
        int[] som = new int[matrix.length];
        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                som[i] += matrix[i][j];
            }
        }
        return som;

    }

    public int[] kolomSommen(int[][] matrix) {
        int[] som = new int[matrix.length];
        for (int j = 0; j < kolommen; j++) {
            for (int i = 0; i < rijen; i++) {
                som[j] += matrix[i][j];
            }

        }
        return som;

    }

    public int[][] aftoppen(int[][] matrix, int n) {
        int[][] nieuweMatrix = new int[rijen][kolommen];

        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                if(matrix[i][j] > Math.abs(n)){
                    nieuweMatrix[i][j] = n;
                }
                else if(matrix[i][j] < (-(Math.abs(n)))){
                    nieuweMatrix[i][j] = - n;
                }
                else{
                    nieuweMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return nieuweMatrix;
    }
}
