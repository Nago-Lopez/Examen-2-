
package examen2_abdenagolopez;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClsEncuesta {
    
  private static ArrayList<String> Nombre = new ArrayList<String>();
  private static ArrayList<String> Correo = new ArrayList<String>();
  private static ArrayList<String> Carro = new ArrayList<String>();
  private static ArrayList<Float> Edad = new ArrayList<Float>();

   
       
    public static void setNombre(String vNombre) {
      Nombre.add(vNombre);
    }

    public static void setCorreo(String vCorreo) {
       Correo.add(vCorreo);
    }
     public static void setCarro(String vCarro) {
       Carro.add(vCarro);
    }
      public static void setEdad(float vEdad) {
       Edad.add(vEdad);
    }
    
     public void imprimir(){
        
        JOptionPane.showMessageDialog(null, "Nombre: "+ Nombre + " \nCorreo: "+ Correo + " \nCarro: "+ Carro + " \nEdad: "+ Edad  );
        
        
    }
   
}
