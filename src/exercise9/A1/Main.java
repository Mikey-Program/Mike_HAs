package src.exercise9.A1;

public class Main {

    public static void main(String[] args) {

        Circle diameter = r -> r > 0.0? r * 2.0 : -1.0;

        Circle surface = r -> {
            if(r<=0){
                System.out.println("falscher radius");
            } else {
                return r*r *Math.PI;
            }
            return -1;
        };

        Circle circumference = r -> {
            if (r <= 0) {
                System.out.println("falscher radius");
            } else {
                return 2 * Math.PI * r;
            }
            return -1;
        };
        // -> man kann schnell implementieren und ändern - eine Methode hat mehrere Umsetzungen
        // man kann nur static oder default methoden einfügen - ka wieso

        double rad = 3;

        diameter.calculate(rad);

    }

}
