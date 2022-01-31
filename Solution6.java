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
        System.out.println(common_end(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(common_end(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(common_end(new int[]{1, 2, 3}, new int[]{1,3}));
    }

    // returns true if the first OR last elements are same
    public static boolean common_end(int[] arr1, int[] arr2){

        // check if the first elements are same
        if (arr1[0] == arr2[0]){
            return true;

        } 
        // check if the last elements are same
        else if (arr1[arr1.length-1] == arr2[arr2.length-1]){
            return true;
        }

        return false;
    }
}
