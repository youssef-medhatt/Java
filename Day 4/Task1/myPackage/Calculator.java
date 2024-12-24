package myPackage;

public class Calculator {
    static int counter = 0;
    static double[] results = new double[100];
   
    
    public static double add(double a,double b)  {
        results[counter] = a + b;
        counter++;
        return a + b;
    }

    public static double sub(double a, double b)  {
        results[counter] = a - b;
        counter++;
        return a - b;
    }
    public static double mult(double a, double b)  {
        results[counter] = a - b;
        counter++;
        return a * b;
    }
    public static double divide(double a, double b) throws NumberisZeroException {
        if (b == 0)
            throw new NumberisZeroException();
        results[counter] = a / b;
        counter++;
        return a / b;
    }

    public static double getResultByIndex(int x) throws IndexOutOfBoundsException {
        if (x - 1 >= counter || x - 1 < 0)
            throw new IndexOutOfBoundsException();

        return results[x - 1];
    }

    public static int factorial(int a) throws NumberisNegativeException{
        if (a < 0) {
            throw new NumberisNegativeException();
        }
        if (a == 0) {
            return 1;
        }
        return a*factorial(a - 1);
    }
}
