package softwarehouse.vu;

public class Solution5 {
    // Given an array of ints,
    // return true if 1, 2, 3 all appears in the array somewhere.
    // e.g.
    // array123([1, 1, 2, 3, 1]) -> True
    // array123([1, 1, 2, 4, 1]) -> False
    // array123([1, 1, 2, 1, 2, 3]) -> True

    public static void main(String[] args) {
        array123(new int[]{1, 1, 2, 3, 1});
        array123(new int[]{1, 1, 2, 4, 1});
        array123(new int[]{1, 1, 2, 1, 2, 3});
    }

    public static void array123(int[] arr){
        boolean num1 = false;
        boolean num2 = false;
        boolean num3 = false;

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 1){
                num1 = true;

            }
            if (arr[i] == 2){
                num2 = true;
            }
            if (arr[i] == 3){
                num3 = true;
            }

        }

        if (num1 && num2 && num3){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
