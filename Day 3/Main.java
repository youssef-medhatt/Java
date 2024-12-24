import myPackage.Quad; 
public class Main {
    public static void main(String[] args) {
        int[] coefficients = {2,4,-6};
        Quad q = new Quad(coefficients);
        try {
            double[] roots = q.apply(coefficients);
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        

    }
}
