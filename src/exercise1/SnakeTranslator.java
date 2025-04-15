package src.exercise1;

import java.util.Scanner;

public class SnakeTranslator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("put in a word");
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();


        for(int i= 0; i< input.length(); i++){ //geht auch mit Array: String wird zu einem Array und durch dieses wird durchgehen
            output.append(input.charAt(i));

            if ("aeiouAEIOU".contains(String.valueOf(input.charAt(i)))){
                output.append("s").append(input.charAt(i));
            }
        }

        System.out.println("Snake Translator:" +output);
        scan.close();
    }
}
