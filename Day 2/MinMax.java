import java.util.Random;

class MinMax {
   static int findMin(int []arr){
        int minValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        
        return minValue;
    }
   static int findMax(int []arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue)
            maxValue = arr[i];
        }
        
        return maxValue;
    }   
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
    
        long startTime = System.nanoTime();
       System.out.println("Min value is = " + findMin(arr));
       System.out.println("Min value is = " + findMax(arr));
       long endTime = System.nanoTime();
       System.out.println("Program took "+(endTime - startTime)+" ns");


    
       
       
       
    }
}
