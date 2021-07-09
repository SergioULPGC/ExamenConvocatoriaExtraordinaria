/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimoniohistorico;


public class CatalogoIterator implements Iterator {
    CatalogoItem[] items;
    int posicion = 0;
    
    public CatalogoIterator(CatalogoItem[] items){
        this.items = items;
    }
    
    public boolean hasNext() {
        if(posicion >= items.length || items[posicion] == null){
            return false;
        }else{
            return true;
        }
    }

    public Object next() {
        CatalogoItem catalogoItem = items[posicion];
        posicion = posicion + 1;
        return catalogoItem;
    }    
    
    public Object remove(){
        if(posicion <= 0){
            throw new IllegalStateException("NO SE PUEDE ELIMINAR EL ITEM.");
        }
        if(items[posicion - 1] != null){
            for(int i = posicion - 1; i < (items.length - 1); i++){
                items[i] = items[i+1];
            }
            items[items.length -1] = null;
        }
    }
}
