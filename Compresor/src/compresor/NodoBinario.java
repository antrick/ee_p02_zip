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
public class NodoBinario<T extends Comparable<T>> implements Comparable<NodoBinario<T>>
{
    private T dato;
    private NodoBinario izq;
    private NodoBinario der;
    
    public NodoBinario(T dato){
     this.dato=dato;
     izq=null;
     der=null;
    }
    public NodoBinario(T dato,NodoBinario izq,NodoBinario der){
     this.dato=dato;
     this.izq=izq;
     this.der=der;
    }
    public T getDato(){
      return dato;
    }
    public NodoBinario getIzquierda(){
     return izq;
    }
    public NodoBinario getDerecha(){
     return der;
    }
    public void setDato(T dato){
      this.dato=dato;
    }
    public void setIzquierda(NodoBinario izq){
     this.izq=izq;
    }
    public void setDerecha(NodoBinario der){
     this.der=der;
    }
      @Override  
      
    public boolean equals(Object obj){
        return this.dato.equals( ((NodoBinario<T>) obj).getDato());
    }
    public int compareTo(NodoBinario<T> ad){
      if(this.getDato().compareTo(ad.getDato())>0){
             return -1;
        }else if(this.getDato().compareTo(ad.getDato())==0){
             return 0;
        }else{
            return 1;
        }
    }
    
     /*public inT compareTo(T T){
        reTurn geTDaTo().compareTo(T);
        }
    
    public inT compareTo(NodoBinario<T> obj){
       return getDato().compareTo(obj.getDato());
    }*/
    
}

