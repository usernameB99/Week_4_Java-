package Woche4;

import java.util.Arrays;
import java.util.Random;

public class GameOfLife_Methods {

    public static void main(String[] args) throws InterruptedException {

        int [][] field = new int [10][10];
        boolean cont = true;

        //fillArrayDefined(field);
        fillArrayRandom(field);

        printIntArray(field);

        int [][] newField;

        do {
            System.out.println();

            newField = nextGeneration(field);

            printIntArray(newField);

            Thread.sleep(1000);

            if (Arrays.deepEquals(field,newField)) {
                cont = false;
            }

            field = newField;

        } while (cont);

    }


    /**
     * prints the field.
     * @param printField the field to be printed
     */
    public static void printIntArray(int[][] printField){         //method for printing array
        System.out.println("-------------------------------");
        for (int i = 0; i < printField.length; i++) {
            for (int j = 0; j < printField.length; j++) {
                if (printField[i][j] == 0) {
                    System.out.print("   ");
                }
                else {
                    System.out.print("  " + printField[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------------------");
    }


    public static void fillArrayRandom (int [][] fillArray ) {

        Random r = new Random();

        for (int i = 0; i < fillArray.length; i++) {
            for (int j = 0; j < fillArray[i].length; j++) {
                fillArray[i][j] = r.nextInt(0,2);
            }
        }
    }

    public static void fillArrayDefined (int[][] fillArray){

        int x = (fillArray.length-1)/2;

        for (int i = 0; i < fillArray.length; i++) {
            for (int j = 0; j < fillArray[i].length; j++) {
                fillArray[i][j] = 0;
                fillArray[x][x] = 1;
                fillArray[x][x-1] = 1;
                fillArray[x][x+1] = 1;
            }
        }

    }


    public static int countNeighbours (int row, int column, int [][] field){

        int livingNeighbours = - field[row][column];                                            // weilas eigene feld mitzöht deswegn hoid - dem anen föd wo ma grod is

        for (int k = (row - 1); k <= (row + 1); k++) {
            for (int l = (column - 1); l <= (column + 1); l++) {

                if (k >= 0 && k < field.length && l >= 0 && l < field.length) {
                    livingNeighbours += field[k][l];
                }
            }
        }
        return(livingNeighbours);
    }

    public static int [][] nextGeneration (int[][] field) {

            int [][] nextField = new int[field.length][field.length];

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field.length; column++) {

               int count = countNeighbours(row, column, field);

                if (field[row][column] == 0) {                                                         //if statements for neighbour rules
                    if (count == 3) {
                        nextField[row][column] = 1;
                    }
                } else if (field[row][column] == 1) {

                     if (count == 2 || count == 3) {
                        nextField[row][column] = 1;
                    }
                }
            }
        }
        return nextField;




    }

}
