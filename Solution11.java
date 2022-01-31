import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution11 {
    // Write a program that should read text from file
    // and display list of all sentences which have
    // at least two consecutive alphabets in it otherwise
    // write sentence in another file.

    public static void main(String[] args) {
        File file = new File("src/softwarehouse/vu/sentences.txt");
        File nonConsecutives = new File("src/softwarehouse/vu/non-consecutive-sentences.txt");
        String[] sentences = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            boolean isConsecutive = false;
            FileWriter fileWriter = new FileWriter(nonConsecutives);

            // reading data from file
            while (line != null) {
                sentences = line.split("\\.");
                // looping through all sentences
                for (String sentence : sentences) {
                    // looping through one sentence
                    for (int i = 0; i + 1<sentence.length(); i++){
                        // checking if the sentence have consecutive characters
                            char ch = sentence.charAt(i);
                            char ch2 = sentence.charAt(i+1);
                            if (ch == ch2){
                                isConsecutive = true;
                            }
                    }

                    // printing the sentence
                    // if it has consecutive characters
                    if (isConsecutive == true){
                        System.out.println(sentence);
                        isConsecutive = false;
                    } else {
                        // otherwise write the sentence
                        // in another file
                        fileWriter.write(sentence + ".");
                    }
                }
                line = bufferedReader.readLine();
            }
            fileWriter.close();
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
