/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Turbotwins2018
 */
public class OpenFileError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\Turbotwins2018\\Desktop\\text.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenFileError.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
