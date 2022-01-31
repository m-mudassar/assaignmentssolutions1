import java.util.Arrays;

public class Solution9 {
    // Write a function Alphabet(str),
    // take the str string parameter being passed
    // and return the string with the letters in alphabetical order
    // i.e.
    // hello becomes ehllo

    public static void main(String[] args) {
        System.out.println(alphabet("hello"));
    }

    public static String alphabet(String str){
        // converting the string to character array
        char[] arr = str.toCharArray();
        String stringInAlphabeticalOrder;
        char temp;

        // sorting in alphabetical order
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

       // converting character array back to string
        stringInAlphabeticalOrder = new String(arr);
        return stringInAlphabeticalOrder;
    }
}
