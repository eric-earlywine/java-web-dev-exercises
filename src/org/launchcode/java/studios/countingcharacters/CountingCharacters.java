package org.launchcode.java.studios.countingcharacters;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        String str = JOptionPane.showInputDialog("Please enter a string or type 'File' to select a file to read from.");
        if (str.toLowerCase().equals("file")) {
            File newFile = pickAFile();
            if (newFile != null) {
                str = new String(Files.readAllBytes(Paths.get(newFile.toString())));
            }
        }
        char[] chars = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> results = new HashMap<>();
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z') {
                if (!results.containsKey(aChar)) {
                    results.put(aChar, 1);
                } else {
                    results.put(aChar, results.get(aChar) + 1);
                }
            }
        }
        if (results.size() < 1) {
            System.out.println("There were no letters in that string!");
        }
        for (char key : results.keySet()) {
            System.out.println(key + ": " + results.get(key));
        }
    }
    public static File pickAFile(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }
}
