package Woche4;

import java.util.Random;
import java.util.Scanner;

public class BingoField {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = 0;

        System.out.println("wie viele felder soll das bingofield in einer reihe haben?");

            while (!sc.hasNextInt(10) ) {
                sc.nextLine();
                System.out.println("gib a zoi ei bzw a zoi de klana is wi 10");
            }
            rows = sc.nextInt();


        int [][] bingofield = new int [rows][rows];
        Random r = new Random();

        int x = bingofield.length/2;
        String s = "";
        for (int i = 0; i < bingofield.length; i++) {
            for (int j = 0; j < bingofield.length; j++) {
                bingofield[i][j] = r.nextInt(1,99);

                if (bingofield.length%2 == 1) {
                    bingofield[x][x] = -1;
                }
                if (bingofield[i][j] == -1) {
                    System.out.printf("%3s %2s", s, "XX");
                }
                else {
                    System.out.printf("%3s %02d", s, bingofield[i][j]);
                    //System.out.printf("   ");
                }
            }
            System.out.println();
        }




    }
}
