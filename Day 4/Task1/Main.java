import myPackage.*;
public class Main {
    public static void main(String[] args) {
        try {
            Calculator.divide(5, 2);
            Calculator.factorial(5);
          System.out.println(Calculator.getResultByIndex(3)); 
        } 
        catch (NumberisZeroException e) {
            e.printStackTrace();
        }
        catch (NumberisNegativeException e) {
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Thank you");
        }   
    }
}
