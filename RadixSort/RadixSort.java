/**
 * @author Jak Ashuraliev
 *
 * Purpose: 
 * Implement the radix sort algorithm by using a queue for each bucket.
 * Your program should demonstrate the use of queues in the execution of a radix sort.
 * In your main method, set up the array as below:
 * int[] list = {7843, 4568, 8765, 6543, 7865, 4532, 9987, 3241,6589, 6622, 1211};
 */

import java.util.Queue;
import java.util.LinkedList;

public class RadixSort {
    
    public static void main(String[] args) {
        
        int[] list = {7843, 4568, 8765, 6543, 7865, 4532, 9987, 3241,6589, 6622, 1211};
        
        // print out array BEFORE sorting
        System.out.println("THE ARRAY BEFORE SORTING: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        
        // radixSort menthod
        radixSort(list, 5);
        
        // print out array AFTER sorting
        System.out.println("THE ARRAY AFTER SORTING: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    
    
    // radixMethod
    public static void radixSort (int[] arr, int maxDigit ) {
        
        // queue implementation with queue size of 10
        Queue<Integer>[] q = new Queue[10];
        
        for (int i = 0; i < 10; i ++) {
            q[i] = new LinkedList<>();
        }
        
        // loop thru and sort the q
        for (int i = 0; i < maxDigit; i++) {
            for (int j = 0; j < arr.length; j++) {
                int digit = arr[j] / (int)Math.pow(10, i) % (10);
                q[digit].add(arr[j]);
            }
            // loop thru and move from q to arr
            int index = 0;
            for (int b = 0; b < 10; b++) {
                if (!q[b].isEmpty()) {
                    while (!q[b].isEmpty()) {
                        arr[index] = (int) q[b].remove();
                        index++;
                    }
                } 
            }
        }
    }
}
