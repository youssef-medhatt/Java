import java.util.function.*;

public class Temp implements Function<, Double> {
    
    public Double apply(Number celcius) {
        return (celcius.doubleValue() * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        Temp t = new Temp();
        Double d = 32.0;
        System.out.println(t.apply(d));
    }
}