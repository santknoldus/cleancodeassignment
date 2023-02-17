// Program to convert an array to reduced form
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    
    //Method for reduced array
    public static int[] toReducedForm(int[] array, int arrayLength) {

        int temp[] = array.clone();
        Arrays.sort(temp);
 
        HashMap<Integer, Integer> umap = new HashMap<>();
 
        /* One by one insert elements of sorted
           temp[] and assign them values from 0 to n-1 */
        int value = 0;
        for (int index = 0; index < arrayLength; index++)
            umap.put(temp[index], value++);
 
        // Convert array by taking positions from umap
        for (int index = 0; index < arrayLength; index++)
            array[index] = umap.get(array[index]);

        return array;
        
    }

    public static void main(String args[]){
        int[] array = {5,10,40,30,20};
        int[] reducedArray = toReducedForm(array,5);
        System.out.println(Arrays.toString(reducedArray));
    }
}