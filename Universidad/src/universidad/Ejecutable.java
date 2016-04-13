/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Usuario14
 */
public class Ejecutable {
    public static void main (String[]args){
    Lectura lectura=new Lectura();
        try {
            lectura.leerArchivo("Datos.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            lectura.otraFormaLectura("Datos.txt");
                    
                    
                    } catch (IOException ex) {
            Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
