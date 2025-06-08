package src.HA8;

import java.util.ArrayList;

public class ShapeStorage <T extends Shape> extends ArrayList<T> { //Klasse, die Shapes oder ihre Subtyen speichern kann
    // Sie ist gleichzeitig eine vollwertige ArrayList für Typen T (Shapes) -> d.h. in eine ArrayList können auch Circle und Rectangle sein?

    public double getTotalArea(){
        double a = 0;
        for(T s : this){
            a += s.getArea();
        }
        return a;
    }

    public void displayAllShapes(){
        for(T s : this){
           System.out.println(s.toString());
        }
    }

    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){
        // Wieso <U extends T>?
        // -> Man definiert einen neuen Typ U, der nur innerhalb dieser Methode gilt, und sagt: "U ist ein Subtyp von T"
        // Damit man andere ShapeStorage<U>-Objekte übergeben kann, z.B. ShapeStorage<Circle>
        // Und Java trotzdem weiß: Das sind gültige Typen für T, weil U extends T
        // -> Richtig?

        for(T s : other){
            if(s.getArea() >= minArea){
                this.add(s);
            }
        }
    }
}
