package softwarehouse.vu;

import java.util.Arrays;

public class Solution6 {
    // Given two arrays of ints a and b
    // return True if they have the same first element
    // or they have the same last element.
    // Both arrays will be length 1 or more
    // e.g.
    // common_end([1, 2, 3], [7, 3]) -> True
    // common_end([1, 2, 3,], [7, 3, 2]) -> False
    // common_end([1, 2, 3], [1,3]) -> True
    // if count of such matches is more than total number of array elements
    // then copies the element of first array into second and second into first

    public static void main(String[] args) {
        common_end(new int[]{1, 2, 3}, new int[]{7, 3});
        common_end(new int[]{1, 2, 3}, new int[]{7, 3, 2});
        common_end(new int[]{1, 2, 3}, new int[]{1,3});
    }

    public static void common_end(int[] arr1, int[] arr2){
        if (arr1[0] == arr2[0]){
            System.out.println("First elements are the same of " + Arrays.toString(arr1) + Arrays.toString(arr2));
        } else if (arr1[arr1.length-1] == arr2[arr2.length-1]){
            System.out.println("Last elements are the same of " + Arrays.toString(arr1) + Arrays.toString(arr2));
        }
    }
}
