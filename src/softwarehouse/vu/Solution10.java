package softwarehouse.vu;

import com.sun.source.tree.BinaryTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution10 {
    // Read numeric values from text file (at-least 500 values),
    // and load the data into binary tree
    // and then traverse it using in-order traversal

    public static void main(String[] args) {

        File file = new File("src/softwarehouse/vu/numbers.txt");

        try {
            FileReader fr = new FileReader(file);
            int content;
            while ((content = fr.read()) != -1) {
                if ((char)content >= '0' && (char)content <= '9'){
                    // add to binary tree
                System.out.print((char)content + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
