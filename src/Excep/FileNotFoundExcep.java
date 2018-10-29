/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package Excep;

import java.io.File;
import java.util.Scanner;

public class FileNotFoundExcep {
    public FileNotFoundExcep() {
        try {
            File file = new File("no.txt");
            Scanner scan = new Scanner(file);
        } catch(java.io.FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }
    }
}
