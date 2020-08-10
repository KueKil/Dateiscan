package main;

import readFile.ReadFile;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        read.listDirectory(new File("C:\\tools")); // Pathname for search
    }

}
