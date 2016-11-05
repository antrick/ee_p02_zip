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
public class ArbolBinario <T extends Comparable<T>>{
	/**
	 * Tiene una raíz, que es el comienzo del árbol de tipo NodoArbol<T>.
	 */
	private NodoBinario<T> raiz;
	
	/**
	 * Implementación del constructor que incializa la raíz en nula.
	 */
	public ArbolBinario(){
		raiz = null;
	}

	/**
	 * Método get que obtiene la raíz.
	 * @return
	 */
	public NodoBinario<T> getRaiz() {
		return raiz;
	}

	/**
	 * Método set que permite modificar la raíz.
	 * @param raiz
	 */
	public void setRaiz(NodoBinario<T> raiz) {
		this.raiz = raiz;
	}
	
	
	public Integer altura(NodoBinario<T> raiz, Integer altura){
        altura += 1;
        Integer izquierda, derecha;
        if (raiz != null){
            System.out.println("El nivel del nodo: " + raiz.getDato() + " es: " + altura);
            izquierda = altura(raiz.getIzquierda(), altura);
            derecha = altura(raiz.getDerecha(),altura);
         }else
             return -1;
        
        if (izquierda > derecha)
          return izquierda += 1;
        else
          return derecha += 1; 
    }
}