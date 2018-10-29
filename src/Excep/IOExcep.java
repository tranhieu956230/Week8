/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package Excep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOExcep {
    public IOExcep() {
        try {
            File f = new File("ok.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
        } catch(java.io.IOException e) {
            System.out.println("IO Exception");
        }
    }
}
