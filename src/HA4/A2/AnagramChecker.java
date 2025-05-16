package src.HA4.A2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram (String a, String b) { //muss man auch Sonderzeichen usw. beachten?
// TODO: implement using countLetters ()
        int [] ha = countLetters(a);
        int [] hb = countLetters(b);
        //Gedanke: Wenn alle Buchstaben gleich oft vorkommen (equals für Arrays)
        //dann sind die Strings Anagramme -> Sonderzeichen usw. nicht beachtet in countLetters()
        return Arrays.equals(ha, hb);
    }

    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int [] countLetters (String s) {
        int [] counts = new int [26];

        for(int i = 0; i< s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(Character.isAlphabetic(c)) {
                int index = c - 97;
                counts[index]++;
            }
        }
        return counts;
    }

    //Erste Version, vor Feedback:
//    public static int [] countLetters (String s) {
//        int [] counts = new int [26];
//        int wert = 0;
//        int index = 0;
//
//        for(int i = 0; i< s.length(); i++){
//            char c = Character.toLowerCase(s.charAt(i));
//            if(Character.isAlphabetic(c)) {
//               wert = (int) c;
//               index = wert - 97;
//               counts[index]++;
//            }
//        }
//        return counts;
//    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts (String s) {
// TODO: implement nicely formatted output
        int[] arr = countLetters(s);
        char c ;
        for(int i = 0; i < 26; i++ ){
            if(arr[i] != 0) {
                c = (char) (i + 97);
                System.out.println(c + ": " + arr[i]);
            }
        }
    }


    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
// Get two strings from the user
        System.out.print (" Enter the first string: ");
        String word1 = scanner.nextLine ();
        System.out.print (" Enter the second string: ");
        String word2 = scanner.nextLine ();
// TODO: Process the strings here (ignore spaces , case)
        System.out.println (" Are they anagrams? " + isAnagram (word1 , word2 ));
        printLetterCounts (word1 );

    }
}