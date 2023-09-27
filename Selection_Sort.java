package Woche4;

public class Selection_Sort {
    public static void main(String[] args) {


        int [] unsorted = {5,7,7,2,9,1,6,8,3,4,0};

        System.out.print("unsortiert: ");
        for (int i = 0; i < unsorted.length; i++) {                     // ausgabe array sortiert
            System.out.print(unsorted[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < unsorted.length-1; i++) {                   //fängt beim ersten eintrag im array an -> index 0
            for (int j = i+1; j < unsorted.length; j++) {               //fängt beim zweiten eintrag im array an -> index 1 (deswegen j+1)
                if (unsorted[j] < unsorted[i]) {                        // wenn pos von [j] klainer ist als [i] -> tauschen
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];                          // 3 tausch zeilen
                    unsorted[j] = temp;
                }
            }                                                           //schleife j - nächster durchgang und prüft nächste [j] position
        }

        System.out.print("sortiert:   ");
        for (int i = 0; i < unsorted.length; i++) {                     // ausgabe array sortiert
            System.out.print(unsorted[i] + " ");
        }
    }
}
//sucht immer minimum wert pro runde und fügt ihn von index aufwärts ein