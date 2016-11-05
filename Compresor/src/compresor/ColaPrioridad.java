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
public class ColaPrioridad<T extends Comparable<T>>
{
  int conta=0;   
    private ListaLigada<T> cola=new ListaLigada<T>();
    public Nodo getElemento(){
     return cola.getInicio();
    }
    public Letra getInicio(){
       NodoBinario ini=(NodoBinario)cola.getInicio().getDato();
       Letra primero=(Letra)ini.getDato();
        return primero;
    }
    public NodoBinario<Letra> getIni(){
       NodoBinario<Letra> ini=(NodoBinario)cola.getInicio().getDato();
       
        return ini;
    }
    public void agrega(T dato){
     cola.InsertaFinal(dato);
    }
    public T retirar(){
     return cola.eliminaInicioDato();
    }
    public void elimina(){
     cola.EliminaInicio();
     conta--;
    }
    public void insertaO(T dato){
      cola.InsertaOrdenado(dato);
      conta++;
    }
    public boolean busqueda(T dato){
       return cola.buscarD(dato);
    }
    public boolean vacia(){
      return cola.estaVacia();
    }
    public T verUltimo(){ //datos contenido
     Nodo<T> temporal=cola.getInicio();
     while(temporal.getSiguiente()!=null){
        temporal=temporal.getSiguiente();
        }
        NodoBinario<T> other=(NodoBinario)temporal.getDato();
        return other.getDato();
    }
    public Nodo ultimoNodo(){ //devuelve un nodo
     Nodo temporal=cola.getInicio();
     while(temporal.getSiguiente()!=null){
        temporal=temporal.getSiguiente();
        }
       
        return temporal;
    }
    public int conta(){
     return conta;
    
    }
    public NodoBinario ultimoBinario(){
     Nodo temporal=cola.getInicio();
     while(temporal.getSiguiente()!=null){
        temporal=temporal.getSiguiente();
        }
       NodoBinario a=(NodoBinario)temporal.getDato();
        return a;
    }
   /* public void sumados(){
     Nodo<T> temporal=cola.getInicio();
     int suma=0;
     while(temporal!=null){
        NodoBinario<T> other=(NodoBinario)temporal.getDato();
        Letra uno=(Letra)other.getDato(); 
        suma+= uno.getCont();
        
         if(temporal.getSiguiente()!=null){
            NodoBinario<T> otro=(NodoBinario)temporal.getDato();
             Letra dos=(Letra)other.getDato(); 
            suma+= dos.getCont();
            temporal=temporal.getSiguiente().getSiguiente();
            }else{
             temporal=temporal.getSiguiente();
            }
         System.out.println(uno.getLetra()+" y "+dos.getLetra()+": "+suma);   
        suma=0; 
        }
    }*/
    
    
    public void recorrido(){
     Nodo<T> temporal=cola.getInicio();
     while(temporal!=null){
        NodoBinario<T> other=(NodoBinario)temporal.getDato();
         System.out.println(other.getDato());
         temporal=temporal.getSiguiente();
        }
        
    }
}

