package src.HA5.A3;

public class Calculator {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static int divideException(int a, int b){ // muss ich hier if-throw oder try-catch verwenden?
        try {
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetischer Fehler: " + e.getMessage());
            //return Double.NaN; (Von GPT Tipp)
            return 0; //hätte ich gemacht, aber eig könnte das verwirren uns als Ergebniss interpretiert werden
        }
    }

    public static void main(String [] args ){
        System.out.println( Calculator.divideException(3, 0));

        try {
            System.out.println("Ergebnis: " + Calculator.divide(2, 0) );
        } catch (ArithmeticException e){
            System.out.println("Nenner darf nicht 0 sein");
        }
    }

    // Zu int geändert - in Übung besprochen - um Exception zu bekommen

    //Exception in der Methode zu behandeln ist besser, da man evtl. nicht darauf achtet und dann selber die Exception nicht behandelt
    // also sollte die Methode selber damit umgehen, um Fehler zu vermeiden.
}
