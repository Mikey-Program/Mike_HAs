package src.HA8;

import java.util.ArrayList;

public class ShapeStorage <T extends Shape> extends ArrayList<T> { //Klasse, die Shapes oder ihre Subtyen speicher kann
    // Sie ist gleichzeitig eine vollwertige ArrayList für Typen T (Shapes)

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

    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){ //Wieso <U extends T>?
        // Damit du andere ShapeStorage<U>-Objekte übergeben kannst, z.B. ShapeStorage<Circle>
        // Und Java trotzdem weiß: Das sind gültige Typen für T, weil U extends T
        // Du definierst einen neuen Typ U, der nur innerhalb dieser Methode gilt, und sagst: "U ist ein Subtyp von T"

        for(T s : other){
            if(s.getArea() >= minArea){
                this.add(s);
            }
        }

    }


}
