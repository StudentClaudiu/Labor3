package main;

public class Main {
    public static void main(String[] args) {
        int[] arr = {27, 29, 35, 47, 53, 55, 39, 40, 51, 63, 73, 86, 96};
        int[] ergebnis = new int[arr.length];
    }

    // Übung 1
    public static int[] nichtAusreichendeNote(int[] array) {
        int counter = 0;
        int[] ergebnis = new int[array.length];

        for (int index = 0; index < array.length; index++) {
            if(array[index] < 40) {
                ergebnis[counter++] = array[index];
            }
        }
        return ergebnis;
    }

    // Übung 2
    public static double durchschnitt(int[] array) {
        int ergebnis = 0;
        for (int index = 0; index < array.length; index++) {
            ergebnis = ergebnis + array[index];
        }
        return ergebnis / array.length;
    }

    // Übung 3
    public static int[] aufgerundet(int[] array) {
        int counter = 0;
        int[] ergebnis = new int[array.length];

        for (int index = 0; index < array.length; index++) {
            int grade = rundenMethode(array[index]);
            ergebnis[counter++] = grade;
        }
        return ergebnis;
    }

    // Funktion um Übung 3 zu lösen
    public static int rundenMethode(int note) {
        if (note < 38) return note;
        else if (note % 10 == 1 || note % 10 == 2) {
            note = note - (note % 10);
        }
        else if (note % 10 == 3 || note % 10 == 4 || note % 10 == 6 || note % 10 == 7) {
            note = note - (note % 10) + 5;
        }
        else if (note % 10 == 8 || note % 10 == 9) {
            note = note - (note % 10) + 10;
        }
        return note;
    }

    // Übung 4
    public static int maximaleAbgerundeteNote(int[] array) {
        int max = 0;
        int[] functionArray = aufgerundet(array);

        for (int index = 0; index < array.length; index++) {
            if (functionArray[index] > max) {
                max = functionArray[index];
            }
        }
        return max;
    }
}