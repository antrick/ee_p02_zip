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
public class Huffman 
{
    private char[] ayu;  /**instanciamos un arreglo auxiliar de char*/
    private int conta=0;  /**instanciamos un contador de caracteres repetidos*/
    private ColaPrioridad<NodoBinario<Letra>> cola=new ColaPrioridad<NodoBinario<Letra>>(); 
    
   public void conteo(String dato){  /**creamos un metodo que acepte como parametro una cadena*/
       System.out.println("palabra: "+dato+"\n");
      ayu= dato.toCharArray();  /**agregamos a un arreglo de char*/
     for(int i=0; i<dato.length(); i++){  /**recorremos la cadena*/
         char aux=dato.charAt(i);  /**recorremos la cadena y con charAt agarramos un caracter*/
         for(int j=0; j<ayu.length; j++){  /**recorremos el arreglo*/
             if(aux==ayu[j]){  /**comparamos los caracteres si son iguales*/
               conta++;  /**si se repite sumamos*/
             }
            }
            System.out.println(aux+" se repite "+conta);
           Letra le=new Letra(aux,conta);
           NodoBinario node=new NodoBinario(le);
           if(!cola.busqueda(node)){
              cola.insertaO(node);
            }
            
             conta=0; /**inicializamos el contador*/
        }
    }
  public ColaPrioridad<NodoBinario<Letra>> getCola() {
		return cola;
	}
  
  public void sumarNodos(){ //sumamos los nodos 
      NodoBinario<Letra> r=null;
      NodoBinario<Letra> aux2=null;//new NodoBinario<Letra>(null);
      NodoBinario<Letra> aux3=null;//new NodoBinario<Letra>(null);
     
      int suma=0;
      while (cola.getElemento().getSiguiente()!=null){ 
          aux2=cola.retirar();
          aux3=cola.retirar();
          suma+=aux2.getDato().getCont();
          suma+=aux3.getDato().getCont();
          r=new NodoBinario(new Letra(suma),aux2,aux3);
          cola.insertaO(r);
          suma=0;
          r=null;
          
      }
      
  } 
   String arbolBinario="",binario="";
  
  
   
    
    public void recorrer(NodoBinario<Letra> r,String codigo){
    if(r!=null){
      String total=codigo;
        if(r.getIzquierda()==null && r.getDerecha()==null){
            	arbolBinario += codigo +"-"+ r.getDato().getLetra();
                
                //System.out.print(arbolBinario);
                binario+=codigo;
                //arbolBinario="";
            }
            //System.out.print(arbolBinario);
            recorrer(r.getIzquierda(), codigo += "0");
            recorrer(r.getDerecha(), total += "1");
    }
  
    }
    
     
   public void mostrar(){
     System.out.println();  
     cola.recorrido(); 
     System.out.println();  
    //System.out.print(arbolBinario);
    }
   
   public void Resultado(){
     System.out.println("\nRecorrido Arbol:\n");  
    System.out.print(arbolBinario);
    System.out.println("\nCodigo Binario:\n");  
    System.out.print(binario);
   }
   
   public void guarda(){
   Archivo archi=new Archivo();
   archi.crearTxt("C:\\Users\\andy\\Desktop\\Mensaje Codificado.txt", arbolBinario);
   }
      
    public static void main(String [] args){
        
      Huffman h=new Huffman();
      h.conteo("hola soy roma");
      h.sumarNodos();
     
      h.mostrar();
       h.recorrer(h.getCola().retirar(),"");
        //System.out.println(); 
           h.Resultado();
    
    //h.asd();
      
    }
   
    /** 
       a b c b t e r o u
       1 1 1 1 2 4 5 7 8
       
        2   2   6
          4   
       */
   
}

