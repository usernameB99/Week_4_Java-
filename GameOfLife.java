package Woche4;

import java.util.Random;
import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {

        char [][] field = new char [20][20];
        char[] content = {'-', '-', '-', '#'};
        Random r = new Random();
        int livingNeighbours;
        boolean cont = true;
        int dist = 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = content[r.nextInt(content.length)];                       //filling array with random chars from content char array
                System.out.print("  " + field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
do {

    for (int i = 0; i < field.length; i++) {                                               //double fore loop to go through every index in field array
        for (int j = 0; j < field.length; j++) {
            int row = i;                                                                   //int for coordinates where actual position in field array -> for set 0 point for search for neighbours double for loop
            int column = j;
            livingNeighbours = 0;

            for (int k = (row - dist); k <= (row + dist); k++) {                           //double for loop with use of point 0 to search for living neighbours
                for (int l = (column - dist); l <= (column + dist); l++) {                 // k & l searching around point 0 of field array for neighbours
                    //System.out.println(l + " might be fucked" + livingNeighbours);

                    if (k >= 0 && k < field.length && l >= 0 && l < field.length) {         //search field limitation for not getting out of bounds
                        if (field[k][l] == '#') {
                            livingNeighbours++;                                             // add +1 for each living neighbour
                        }
                    }


                }
            }

            if (field[i][j] == '-') {                                                         //if statements for neighbour rules
                if (livingNeighbours >= 3) {
                    field[i][j] = '#';
                }
            } else if (field[i][j] == '#') {
                if (livingNeighbours < 2) {
                    field[i][j] = '-';
                } else if (livingNeighbours == 2 || livingNeighbours == 3) {
                    field[i][j] = '#';
                } else {                       // livingNeighbours > 3
                    field[i][j] = '-';
                }

            }


        }

    }
    System.out.println();
    printCharArray(field);                                                          // use method to print array

    System.out.println();
    System.out.println("continue?");                                             // system.in breakpoint to manually continue program
    sc.nextLine();




} while (cont);                                                                  //loop to continue program over and over again
    }

    public static void printCharArray(char[][] printField){                     //method for printing array
        for (int i = 0; i < printField.length; i++) {
            for (int j = 0; j < printField.length; j++) {
                System.out.print("  " + printField[i][j]);
            }
            System.out.println();
        }
    }




}

