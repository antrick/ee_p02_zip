/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

import java.io.*;

/**
 *
 * @author andy
 */

public class Archivo {
    File f;
    FileReader lector;
    FileWriter escritor;
    
    public void recibe(String nombre, String texto){
     String temp=this.leer(nombre);
     temp=temp+texto;
     this.crearTxt(nombre, temp);
    }
    public void crearTxt(String nombre, String texto){
        try{
            f=new File(nombre);
            escritor= new FileWriter(f);
            BufferedWriter bw= new BufferedWriter(escritor);
            PrintWriter salida=new PrintWriter(bw);
            
            salida.write(texto+"\n");
            salida.close();
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    public String leer(String nombre){
        
        try{
        f= new File(nombre);
        lector =new FileReader(f);
        BufferedReader br=new BufferedReader(lector);
        String l="";
        String aux="";
        
        while(true){
            aux=br.readLine();
            if(aux!=null)
                l=l+aux;
            else
                break;
        }
        br.close();
        lector.close();
        return l;
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
          return null;
    }
    
}
