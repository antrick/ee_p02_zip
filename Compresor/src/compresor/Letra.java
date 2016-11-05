/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

/**
 *
 * @author andy
 */
public class Letra implements Comparable<Letra>
{
   private char letra;
   private int cont;
   private int suma;
   private String binario;
   public Letra(char letra,int cont){
     this.letra=letra;
     this.cont=cont;
     suma=0;
    }
   public Letra(int cont){
     letra='\0';
     //cont=0;
     this.cont=cont;
    }
   public Letra(char letra,String binario){
     this.letra=letra;
     //cont=0;
     this.binario=binario;
    }
   public void setLetra(char letra){
    this.letra=letra;
    }
   public char getLetra(){
     return letra;
    }
   public void setCont(int cont){
     this.cont=cont;
    }
   public int getCont(){
     return cont;
    }
   public void sum(){
     cont++;
    }
   
    
  public String toString(){
     String s= letra+""+binario+""+cont;
     return s;
    }
    
  @Override
    public boolean equals(Object obj){
        return this.letra == ((Letra) obj).letra;
    }
    
  public int compareTo(Letra obj){
    int resultado=0;
      if(this.cont>obj.cont){
       resultado=1;     
      }
      if(this.cont<obj.cont){
       resultado=-1;     
      }
      if(this.cont==obj.cont){
       resultado=0;     
      }
      return resultado;
    }
}
