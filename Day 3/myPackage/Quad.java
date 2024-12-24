package myPackage;
import java.util.function.*;

public class Quad extends Equation  {
    private int c;
    private double d;

    public Quad(int[] coefficients) {
        super(coefficients[0], coefficients[1]);
        c = coefficients[2];
    }
   
    private boolean checkDisNegative(){
        if(d < 0) return true;
        return false;
    }

    private double computeD() {
        return (b * b) - (4 * a * c);
    }

    private double computePosRoot() {
        return (-b + Math.sqrt(d)) / (2 * a);
        
    }

    private double computeNegRoot() {

        return (-b - Math.sqrt(d)) / (2 * a);
        
    }
    @Override
    public double[] apply(int[] coefficients) {
        double[] roots = new double[2];
        if (!checkArrLen(coefficients,3)) 
            throw new IllegalArgumentException("array must be size 3");
        if (checkAcoefficientEqualsZero(a))
            throw new IllegalArgumentException("a can't be 0");
         d = computeD();
        if (checkDisNegative())
            throw new RuntimeException("d is negative");
        
        roots[0] = computePosRoot();
        roots[1] = computeNegRoot(); 
        return roots;
    }

}