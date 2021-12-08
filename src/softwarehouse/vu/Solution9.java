package softwarehouse.vu;

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
        char[] arr = str.toCharArray();
        String reversedString;
        char temp;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

       // System.out.println(arr);
        reversedString = new String(arr);
        return reversedString;
    }
}
