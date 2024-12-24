package myPackage;

import java.util.function.Function;

public abstract class Equation implements Function<int[], double[]>{
    protected int a;
    protected int b;

    public Equation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected boolean checkArrLen(int[] arr, int length) {
        if (arr.length == length)
            return true;
        return false;
    }
    protected boolean checkAcoefficientEqualsZero(int x){
        if(x == 0) return true;
        return false;
    }
}
