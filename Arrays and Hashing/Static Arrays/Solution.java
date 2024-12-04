// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.Arrays;

public class Solution {
  private int[] removeDuplicates(int[] nums) {
    int val = nums[0];
    int uniques = 1;

    // psuedo code
    // for i in array, starting from 1
    //  if value of array[i] is not the same as previous value
    //    update value
    //    swap the values
    //    increment count of uniques by one
    //  else
    //    soft delete value

    for (int i = 1; i < nums.length; i++) {
      if (val != nums[i]) { 
        val = nums[i];
        nums[i] = -1;
        nums[uniques] = val;
        uniques++;
      } else {
        nums[i] = -1;
      }
    }
    System.out.println(uniques);
    return nums;
  }

  private void TestCases() {
    int[] arr1 =  {1,1,1,2,2,2}; // {1,2,null,null,null}
    int[] arr2 = {1,1,2,2,3,4,4,5}; // {1,2,3,4,null,null,null}
    int[] arr3 = {1,2,2,2,3,3,3,4,4,5,5}; // {1,2,3,4,5,null,null,null,null,null,null}
    int[] arr4 = {1,2,3,4,5}; // {1,2,3,4,5}
    int[] arr5 = {1,1,1,1,1}; // {1,null,null,null,null}

    
    System.out.println(Arrays.toString(removeDuplicates(arr1)));
    System.out.println(Arrays.toString(removeDuplicates(arr2)));
    System.out.println(Arrays.toString(removeDuplicates(arr3)));
    System.out.println(Arrays.toString(removeDuplicates(arr4)));
    System.out.println(Arrays.toString(removeDuplicates(arr5)));
  }

  public static void main(String[] args){
    Solution solution = new Solution();
    solution.TestCases();
  }
}
