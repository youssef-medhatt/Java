class MinMaxBinarySearch {
 static int binarySearch(int[] arr, int item) {
         //Binary search
    int middle = arr.length / 2;
    int start = 0;
    int end = arr.length - 1;

    while (middle != 0 && middle != (arr.length - 1)) {
        if (arr[middle] == item)
            return middle;
        if (item > arr[middle]) {
            start = middle + 1;
            middle = (end + start) / 2;
        }
        else {
            end = middle;
            middle = (end + start) / 2;
        }
            
           
    }
        return -1;
    }
public static void main(String[] args) {

    int arr[] = new int[1000];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i;
    }
    
    long startTime = System.nanoTime();
    int index = binarySearch(arr, 789);
    long endTime = System.nanoTime();
    if (index == -1) 
        System.out.println("Element not found");
    
    else
        System.out.println("Element found at index = " + index);
    
    System.out.println("Program took "+(endTime - startTime)+" ns");
  
}
}