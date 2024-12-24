package myPackage;
import java.util.ArrayList;

public class Test {
    public void displayList(ArrayList<? extends Shape> list){
         for (int i = 0; i < list.size(); i++) {
            list.get(i).draw();
         }
    }
}
