package src.HA8;

import java.util.*;

public class ShapeAnalyzer {

    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        ArrayList<Shape> store = new ArrayList<>();

        for (Shape s : shapes){
            if (s.getArea() >= minArea){
                store.add(s);
            }
        }
        return store;
    }

    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        Shape max = null;

        for(Shape s : shapes){
            if(max == null || s.getArea()>max.getArea()){
                max = s;
            }
        }
        return max;
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){

        Map<String, List<T>> grouped = new HashMap<>();

        for(T s : shapes){
            if(!grouped.containsKey(s.getClass().getSimpleName())){
                grouped.put(s.getClass().getSimpleName(), new ArrayList<>());
            } else {
                grouped.get((s.getClass().getSimpleName())).add(s);
            }
        }
        return grouped;
    }
}
