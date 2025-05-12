package src.HA5.A3;

public class Calculator {
    public static double divide(double a, double b) throws ArithmeticException{
        return a/b;
    }

    public static double divideException(double a, double b){ // muss ich hier if-throw oder try-catch verwenden?
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

    // Es kommt "infinity" als Ergebnis - ist das ok so?
}
