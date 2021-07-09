/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimoniohistorico;

import java.util.Scanner;

/**
 *
 * @author sdels
 */
public class Turista {
    String tematica;
    Catalogo bustosCatalogo;
    Catalogo puentesCatalogo;
    Catalogo estatuasCatalogo;
    Catalogo catedralesCatalogo;
    Catalogo grafitisCatalogo;
    Catalogo edificiosCatalogo;
    
    public Turista(Catalogo bustosCatalogo, Catalogo puentesCatalogo, Catalogo estatuasCatalogo, Catalogo catedralesCatalogo, Catalogo grafitisCatalogo, Catalogo edificiosCatalogo){
        this.bustosCatalogo = bustosCatalogo;
        this.puentesCatalogo = puentesCatalogo;
        this.estatuasCatalogo = estatuasCatalogo;
        this.catedralesCatalogo = catedralesCatalogo;
        this.grafitisCatalogo = grafitisCatalogo;
        this.edificiosCatalogo = edificiosCatalogo;                
    }
    
    public void obtenerTematica(){
        Scanner teclado = new Scanner(System.in);
        tematica = teclado.nextLine();
    }
     
    public void imprimeRecorrido(){
        Iterator CatalogoIterator = (Iterator) estatuasCatalogo.createIterator();
    }
    
    public void obtenerRecorrido(Iterator iterator){
        while(iterator.hasNext()){
            CatalogoItem catalogoItem = (CatalogoItem)iterator.next();
            if(catalogoItem.getTematica = tematica){
                System.out.println();
            }
            
        }
    }
}
