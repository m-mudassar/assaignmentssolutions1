public class Solution2 {

    // Write a function which should add the two vowels in the arrays
    // and generate the third array and
    // store vowels only once, if repeated


    public static void main(String[] args) {
        char[] arr1 = {'e', 'e', 'c', 'y', 'c', 'u', 'A', 'o', 'a'};
        char[] arr2 = {'i', 'r', 'i', 'y', 'c', 'u', 'a'};
        int counter = 0;
        String[] arr3;
        String vowelsOfArr1 = "";
        String vowelsOfArr2 = "";

        // getting vowels of arr1
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (ch == 'a'
                    || ch == 'A'
                    || ch == 'e'
                    || ch == 'E'
                    || ch == 'i'
                    || ch == 'I'
                    || ch == 'o'
                    || ch == 'O'
                    || ch == 'u'
                    || ch == 'U') {
                vowelsOfArr1 += ch;
            }
        }

        // getting vowels of arr2
        for (int j = 0; j < arr2.length; j++) {
            char ch2 = arr2[j];
            if (ch2 == 'a' || ch2 == 'A'
                    || ch2 == 'e'
                    || ch2 == 'E'
                    || ch2 == 'i'
                    || ch2 == 'I'
                    || ch2 == 'o'
                    || ch2 == 'O'
                    || ch2 == 'u'
                    || ch2 == 'U') {
                vowelsOfArr2 += ch2;
            }
        }

        // counting the elements for the third array
        // counter is to count the elements
        // that are inserted to the third array
        // so that we don't make an array with random size
        int i, j;
        for (i = 0, j = 0; i <= vowelsOfArr1.length() - 1 && j <= vowelsOfArr2.length() - 1; i++, j++) {
            String st = String.valueOf(vowelsOfArr1.charAt(i)) + String.valueOf(vowelsOfArr2.charAt(i));
            counter++;
        }

        // making the third array with size of elements
        arr3 = new String[counter];
        for (i = 0, j = 0; i <= vowelsOfArr1.length() - 1 && j <= vowelsOfArr2.length() - 1; i++, j++) {
            String st = String.valueOf(vowelsOfArr1.charAt(i)) + String.valueOf(vowelsOfArr2.charAt(i));
            // storing the elements to third array
            arr3[i] = st;
        }

        // Removing duplicates from third array
        // Before removing duplicates
        System.out.println("Before removing duplicates ");

        for(int l=0; l< arr3.length;l++){
            if(arr3[l]==null)
                continue;
            System.out.println(arr3[l]);
        }

        System.out.println(" ");

        // removing duplicates
        removeDuplicates(arr3);

        // After removing duplicates
        System.out.println("After removing duplicates ");

        for(int l=0; l< arr3.length;l++){
            if(arr3[l]==null)
                continue;
            System.out.println(arr3[l]);
        }

    }

    // function to remove duplicates from the array
    public static void removeDuplicates(String[] str){
        for(int i=0; i<str.length-1; i++){
            if(str[i]!=null){
                for(int j=i+1; j<str.length-1; j++){
                    if(str[i].equals(str[j])){
                        str[j]=null;
                    }
                }
            }
        }
    }
}
