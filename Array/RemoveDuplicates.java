package Array;

/*
Question:
Given an integer array nums sorted in non-decreasing order,
remove duplicates in-place so that each unique element
appears only once.

Return the number of unique elements (k).

The first k elements of nums should contain the unique
elements in sorted order.


Approach / Algorithm:

1. If the array is empty, return 0.

2. Initialize k = 1 to track the position of the next
   unique element.

3. Start a loop from index 1.

4. Compare the current element nums[i] with nums[k - 1].

5. If both elements are different:
   - Place nums[i] at nums[k].
   - Increment k.

6. If both elements are same, skip the duplicate.

7. Return k.

*/


public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[k - 1] != nums[i]) {

                nums[k] = nums[i];

                k++;
            }
        }

        return k;
    }


