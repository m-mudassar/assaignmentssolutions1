package softwarehouse.vu;

public class Solution8 {
    // Write a function Word(sen),
    // take the sen parameter being passed
    // and return the largest word in the string
    // If there are two or more words that are the same length,
    // return the first word from the string with that length

    public static void main(String[] args) {
        System.out.println(word("We all love pakistan and it is our lovely country welinali"));
    }

    public static String word(String sen){
        String[] words = sen.split(" ");
        String maxLengthWord = "";

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > maxLengthWord.length()){
                maxLengthWord = words[i];
            }
        }
        return maxLengthWord;
    }
}
