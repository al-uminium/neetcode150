import java.util.Arrays;

public class RemoveElements {
  
  private int[] removeElement(int[] nums, int k){
    // pseudo code
    // count is 1 
    // for i in nums:
    //  if nums[i] is k:
    //    nums[i] = -1
    //  else:
    //    move this number to next index (i.e., no. of counts)
    //    unique count ++
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != k) {
        nums[count] = nums[i];
        count++;
      }
      // if (nums[i] == k) {
      //   nums[i] = -1;
      // } else {
      //   nums[count] = nums[i];
      //   count++;
      //   if (count == i) {
      //     nums[i] = -1;
      //   }
      // }
      // the one i commented out is the code i written out to "soft delete" the numbers that are not k, which works, but is not needed
    }

    return nums;
  }

  private void testCases(){
    int[] arr1 = {1,2,3,4,2};
    int[] arr2 = {1,1,2,2};
    int[] arr3 = {1,1};
    int[] arr4 = {6,2,1,0,4,1};


    System.out.println(Arrays.toString(removeElement(arr1, 2)));
    System.out.println(Arrays.toString(removeElement(arr2, 1)));
    System.out.println(Arrays.toString(removeElement(arr3, 1)));
    System.out.println(Arrays.toString(removeElement(arr4, 1)));
  }

  public static void main(String[] args) {
    RemoveElements RemoveElements = new RemoveElements();
    RemoveElements.testCases();
  }
}
