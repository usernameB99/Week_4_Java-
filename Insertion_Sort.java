package Woche4;

public class Insertion_Sort {
    public static void main(String[] args) {

        int [] unsorted = {5,7,7,2,9,1,6,8,3,4,0};

        for (int i = 0; i < unsorted.length; i++) {
            int temp = unsorted[i];                         //aktuelle position in zwischenspeicher
            int j = i - 1;                                  //initialisierung - j ist immer eine stelle vor i

            while (j >= 0 && temp < unsorted[j]) {          //vergleichen abwärts wo platz
                unsorted[j+1] = unsorted[j];                //wird so lange abwärts getauscht bis platz gefunden
                j--;                                        //j-- damit abwärts läuft
            }
            unsorted[j+1] = temp;

        }

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i]);
        }

    }
}

//fängt bei index 0 an und schaut ob voriges element kleiner ist (vergleich mit vorigem element)
//untersucht so lange nach hinten gereihte element bis platz gefunden