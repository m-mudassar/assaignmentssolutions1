public class Solution3 {
    // Write a program to return the third and last largest number in the array
    // if first largest number is greater than second-largest by 20%
    public static void main(String[] args) {
        int firstLargest;
        int secondLargest;
        int lastLargest;
        int twentyPercentOfSecondLargest;

        int[] arr = {1, 100, 3, 8, 6, 9, 199, 120 };
        int temp;

        // Sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // printing the sorted array
        System.out.println("\n Sorted array \n");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        firstLargest = arr[0];
        secondLargest = arr[1];
        lastLargest = arr[2];

        // finding the twenty percent of second largest number
        twentyPercentOfSecondLargest = (int)(secondLargest*(20/100.0f));
        int fullPercentageOfFirstLargest = (twentyPercentOfSecondLargest + secondLargest) - 1;

        // checking if the first largest number is greater than the second largest by 20%
        if (firstLargest > fullPercentageOfFirstLargest){
            System.out.println("Returning the number: " + lastLargest);
        } else  {
            System.out.println("Error! first largest number is not greater than second-largest by 20%");
        }
    }
}
