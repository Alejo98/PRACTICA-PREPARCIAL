/*http://zetcode.com/tutorials/javagamestutorial/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Usuario14
 */
public class Lectura {
    public void leerArchivo(String ruta) throws FileNotFoundException{
        Scanner sc=new Scanner(new File(ruta));
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
    public void otraFormaLectura(String ruta) throws FileNotFoundException, IOException{
        BufferedReader bf=new BufferedReader
                (new FileReader(new File(ruta)));
        String linea;
        while((linea=bf.readLine())!=null){
          String token[]=linea.split(",");
          for(String t:token)
              System.out.println(t);      
        }
        
        bf.close();
    }

    
}
