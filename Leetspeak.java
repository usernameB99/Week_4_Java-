package Woche4;

import java.util.Scanner;

public class Leetspeak {
    public static void main(String[] args) {

        String alphabetwort = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] alphabet = alphabetwort.toCharArray();

        String alphabetchar = "@8(D3F6#!JK1MN0PQR$7UVWXY2";

        char[] characters = alphabetchar.toCharArray();

        Scanner sc = new Scanner(System.in);

        System.out.println("geben sie Wort ein");

        String inputstring = sc.nextLine().toUpperCase();        //eingabe string

        char[] inputchars = inputstring.toCharArray();           //eingabe string to char array

        for (int i = 0; i < inputchars.length; i++) {           //i-for für überprüfung von eingegebenem
            if (inputchars[i] == ' ') {
                System.out.print(" ");
            }
            for (int j = 0; j < alphabet.length; j++) {         //j-for zum durchlaufen von alphabet
                if (inputchars[i] == alphabet[j]) {             //wenn ein char von eingabe mit alphabet übereinstimmt
                    System.out.print(characters[j]);            //druckt mit position j diesen übereinstimmenden char mit index j aus (von anderem alphabet)
                }
            }
        }
    }
}