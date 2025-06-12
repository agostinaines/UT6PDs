/*package UT6PD1;

import utils.THash;

import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {
    private HashMap<Character, TNodoTrie> hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new HashMap<Character, TNodoTrie>();
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);
                
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s+(char)(c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void imprimir() {
        
        imprimir("", this);
    }
    
      public TNodoTrie buscarNodoTrie(String s) {
        V nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (hijos.buscar(indice) == null) {
                return null;
            }

            nodo = hijos.buscar(indice);
        }
        return nodo;
    }
    
     private void predecir(String s, String prefijo, LinkedList<String> palabras, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                palabras.add(s);
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    predecir(s + (char) (c + 'a'), prefijo, palabras, nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie nodo = buscarNodoTrie(prefijo);
        if (nodo != null) {
            predecir(prefijo, prefijo, palabras, nodo);
        }
    }

    @Override
    public int buscar(String s) {
        TNodoTrie nodo = this;
        int contador = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return 0;
            }
            contador++;
            nodo = nodo.hijos[indice];
            if (contador == s.length() && !nodo.esPalabra) {
                return 0;
            }
        }
        return contador;
    }
}*/
