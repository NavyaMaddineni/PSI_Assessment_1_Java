//Program to print k largest numbers from the given array.
import java.util.*;
class largest {
	 public static void main(String[] args) 
    {
		//declaring and initialising integer array.
        Integer arr[] = new Integer[]{0,9,7,4,2,4,6,10,1};
        int k = 5;
		System.out.println("Initial Array: ");
		//Converting array to string and printing it.
		System.out.println(Arrays.toString(arr));
		//Sorting the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());         
		System.out.println(k +" largest elements of the initial array are:");
		//printing k largest elements.
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
      }      
  }
