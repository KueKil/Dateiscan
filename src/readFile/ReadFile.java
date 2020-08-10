package readFile;

import java.io.File;

public class ReadFile {

    public static void listDirectory(File dir) {

            File[] files = dir.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    System.out.print(files[i].getAbsolutePath());
                    if (files[i].isDirectory()) { // look for subdirectory. If exists, start the method again
                        System.out.print(" (Folder)\n"); // is Folder
                        listDirectory(files[i]);
                    } else {
                        System.out.print(" (File)\n"); // is File
                    }
                }
            } else { // if Pathname is false..
                System.out.println("\n" + "The path does not exist, please try again");
            }
    }

}
