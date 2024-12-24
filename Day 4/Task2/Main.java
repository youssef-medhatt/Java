import java.util.ArrayList;

import myPackage.*;
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        ArrayList<Rectangle> listRectangles = new ArrayList<Rectangle>();
        listRectangles.add(new Rectangle());
        listRectangles.add(new Rectangle());
        listRectangles.add(new Rectangle());

        ArrayList<Circle> listCircles = new ArrayList<Circle>();
        listCircles.add(new Circle());
        listCircles.add(new Circle());
        listCircles.add(new Circle());        
        listCircles.add(new Circle());
        
        t.displayList(listRectangles);
        t.displayList(listCircles);

        
    }
}
