/**
 * 
 */
package carnivore;

/**
 * @author n91bu1n15
 *
 */

import java.util.Arrays;
import java.math.*;

public class RecMinMaxer {
	

	static int[] nums = {2,2,2,2}; 
	//static int[] firstHalf = new int[0];
	static int iterationCounter = 0;
	//int pivot = 0;
	
	public static int[] minMax(int[] nums, int begin, int end){
	
	//int max, min = 0;
		
		//base case - only 1 element in the list
		if (nums.length == 1) {
			
			int[] firstHalf = new int[2];
			
			end = nums[0];
			begin = end;
			System.out.print("\nBegin is " + begin);
			System.out.print("\nEnd is " + end);
			
			firstHalf[0] = begin;
			firstHalf[1] = end;
			
			System.out.print("\n\nMy Final array is : " + Arrays.toString(firstHalf));
			
			return firstHalf; 
		}
		
		else if (nums.length%2 == 0) {
			
			System.out.print("\nList is EVEN!\n");
			
			double doublePivot =  Math.floor((nums.length)/2);
			System.out.print("Double Pivot is : " + doublePivot);
			int pivot = (int) doublePivot; 
			System.out.print("Pivot is : " + pivot);
			
			int[] firstHalf = new int[pivot];
			
			System.out.print("\nCHECK 1: My curr firstHalf array: " + Arrays.toString(firstHalf));
			
			int j = 0; 
			int currElement = 0; 
			
			System.out.print("\nStart -->");
			
			for (int i=0; i <= ((nums.length-pivot)-1); i++){
				
				//firstHalf = new int[pivot];
				System.out.print("\nElement " +i+ " : " +nums[i] + "\n");
				currElement = nums[i];
				System.out.print("Current Element: " + currElement + " at Location " + nums[i]);

				firstHalf[j] = currElement;
				System.out.print("\nMy curr firstHalf array: " + Arrays.toString(firstHalf) + " and added " + currElement);

				  j++; 
				  System.out.print("\nIncrement\n");
			}
			
			System.out.print("\nEXITING: First Half array is : ");
			System.out.print(Arrays.toString(firstHalf));
			
			//System.out.print(Arrays.toString(firstHalf) + "\n");
			
			System.out.print("\nPivot: " + pivot + "\n");
			
			System.out.print("My Final array is : " + Arrays.toString(firstHalf));
			
			return firstHalf;
			
		} //end if
		else {
			
			System.out.print("\nList is ODD!\n");
			
			double doublePivot =  Math.floor((nums.length)/2);
			System.out.print("Double Pivot is : " + doublePivot);
			int pivot = (int) doublePivot; 
			System.out.print("Pivot is : " + pivot);
			
			int[] firstHalf = new int[pivot];
			
			System.out.print("\nCHECK 1: My curr firstHalf array: " + Arrays.toString(firstHalf));
			
			int j = 0; 
			int currElement = 0; 
			
			System.out.print("\nStart -->");
			
			for (int i=0; i < ((nums.length-pivot)-1); i++){
				
				//firstHalf = new int[pivot];
				System.out.print("\nElement " +i+ " : " +nums[i] + "\n");
				currElement = nums[i];
				System.out.print("Current Element: " + currElement + " at Location " + nums[i]);

				firstHalf[j] = currElement;
				System.out.print("\nMy curr firstHalf array: " + Arrays.toString(firstHalf) + " and added " + currElement);

				  j++; 
				  System.out.print("\nIncrement\n");
			}
			
			System.out.print("\nEXITING: First Half array is : ");
			System.out.print(Arrays.toString(firstHalf));
			
			//System.out.print(Arrays.toString(firstHalf) + "\n");
			
			System.out.print("\nPivot: " + pivot + "\n");
			
			System.out.print("My Final array is : " + Arrays.toString(firstHalf));
			
			return firstHalf;
			
		} //end if-else
		
	} // end int[] minMax method
	
	public static void main(String[] args) {
		
		RecMinMaxer.minMax(nums, 0, 0);

	}

}
