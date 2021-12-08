package softwarehouse.vu;

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


        int i, j;
        for (i = 0, j = 0; i <= vowelsOfArr1.length() - 1 && j <= vowelsOfArr2.length() - 1; i++, j++) {
            String st = String.valueOf(vowelsOfArr1.charAt(i)) + String.valueOf(vowelsOfArr2.charAt(i));
            counter++;
        }

        arr3 = new String[counter];

        for (i = 0, j = 0; i <= vowelsOfArr1.length() - 1 && j <= vowelsOfArr2.length() - 1; i++, j++) {
            String st = String.valueOf(vowelsOfArr1.charAt(i)) + String.valueOf(vowelsOfArr2.charAt(i));
            arr3[i] = st;
        }

        System.out.println("Before removing duplicates ");

        for(int l=0; l< arr3.length;l++){
            if(arr3[l]==null)
                continue;
            System.out.println(arr3[l]);
        }

        System.out.println(" ");

        removeDuplicates(arr3);

        System.out.println("After removing duplicates ");

        for(int l=0; l< arr3.length;l++){
            if(arr3[l]==null)
                continue;
            System.out.println(arr3[l]);
        }

    }


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
