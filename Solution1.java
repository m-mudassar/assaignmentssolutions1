public class Solution1 {
    // Write a program which should count vowels in the string
    // and return vowels in reverse order if vowels are more than three
    public static void main(String[] args) {
        int count = 0;
        String s = "aeiouand";
        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i<s.length(); i++){
            // getting a char from string
            char ch = s.charAt(i);
            if (ch == 'a'|| ch == 'A'
                    || ch == 'e'
                    || ch == 'E'
                    || ch == 'i'
                    || ch == 'I'
                    || ch == 'o'
                    || ch == 'O'
                    || ch == 'u'
                    || ch == 'U'){
            // if vowels found, increment count
                count++;
                vowels.append(ch);
            }
        }
        // if vowels are more than 3, reverse the vowels
        if (count > 3){
            StringBuilder reversedString = new StringBuilder(vowels.toString());
            reversedString.reverse();
            System.out.println(reversedString);
        } else {
            System.out.println("The count is less than 3");
        }

    }
}
